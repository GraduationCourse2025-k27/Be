package com.kltn.medicalwebsite.repository;

import com.kltn.medicalwebsite.entity.MedicalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface MedicalTypeRepository  extends JpaRepository<MedicalType,Long> {

    @Query("Select COUNT(a.id) from MedicalType m LEFT JOIN m.consultationSchedules c LEFT JOIN c.appointments a ")
    Long countByMedicalServiceUse();
}
