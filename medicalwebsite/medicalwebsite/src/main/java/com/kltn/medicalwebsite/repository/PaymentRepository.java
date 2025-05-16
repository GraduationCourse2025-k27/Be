package com.kltn.medicalwebsite.repository;

import com.kltn.medicalwebsite.entity.Appointment;
import com.kltn.medicalwebsite.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {
    Optional<Payment> findFirstByAppointment(Appointment appointment);
    @Query("SELECT COALESCE(SUM(p.amount), 0) FROM Payment p WHERE YEAR(p.datePayment) = :year ")
    Double sumRevenueByYear(int year);

    @Query("SELECT COALESCE(SUM(p.amount), 0) FROM Payment p WHERE MONTH(p.datePayment) = :month AND YEAR(p.datePayment) = :year")
    Double sumRevenueByMonthAndYear(int month, int year);

    @Query("SELECT COALESCE(SUM(p.amount), 0) FROM Payment p WHERE MONTH(p.datePayment) BETWEEN :startMonth AND :endMonth AND YEAR(p.datePayment) = :year ")
    Double sumRevenueByMonthRangeAndYear(int startMonth, int endMonth, int year);
}
