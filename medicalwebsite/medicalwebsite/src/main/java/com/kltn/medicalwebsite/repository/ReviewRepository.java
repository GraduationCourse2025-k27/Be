package com.kltn.medicalwebsite.repository;

import com.kltn.medicalwebsite.entity.Review;
import com.kltn.medicalwebsite.response.Top5DoctorResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {

    List<Review> findByDoctorId(Long doctorId);

    @Query("SELECT new com.kltn.medicalwebsite.response.Top5DoctorResponse(r.doctor,AVG(r.rate)) " +
            "FROM Review r " +
            "GROUP BY r.doctor.id " +
            "ORDER BY AVG(r.rate) DESC ")
    List<Top5DoctorResponse> FindTop5Doctor();
}
