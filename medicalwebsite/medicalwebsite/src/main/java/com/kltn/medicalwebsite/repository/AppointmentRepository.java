package com.kltn.medicalwebsite.repository;

import com.kltn.medicalwebsite.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


@Repository
public interface AppointmentRepository  extends JpaRepository<Appointment,Long> {

    List<Appointment> findByEmail(String email);
    List<Appointment> findByPaymentsIsEmptyAndDateAppointmentBefore(LocalDateTime localDateTime);

    @Query("SELECT COUNT(a) FROM Appointment a Where YEAR(a.dateAppointment) = :year")
    Long countByYear(int year);

    @Query("SELECT COUNT(a) FROM Appointment a Where MONTH(a.dateAppointment) = :month and YEAR(a.dateAppointment) = :year")
    Long countByMonthAndYear(int month , int year);

    @Query("SELECT COUNT(a) FROM Appointment a Where MONTH(a.dateAppointment) BETWEEN :startMonth AND :endMonth AND YEAR(a.dateAppointment) = :year")
    Long countByMonthRangeAndYear(int startMonth,int endMonth,int year);

    @Query("SELECT a.consulationSchedule.medicalType.id, a.consulationSchedule.medicalType.nameService, COUNT(a) " +
            "FROM Appointment a " +
            "GROUP BY a.consulationSchedule.medicalType.id, a.consulationSchedule.medicalType.nameService")
    List<Object[]> countAppointmentsByMedicalType();
}
