package com.kltn.medicalwebsite.repository;

import com.kltn.medicalwebsite.entity.ConsultationSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConsultationScheduleRepository extends JpaRepository<ConsultationSchedule,Long>{



    @Query("select c from ConsultationSchedule c where c.doctor.id = :doctorId")
    public List<ConsultationSchedule> findScheduleByDoctorId(@Param("doctorId") Long doctorId);
}
