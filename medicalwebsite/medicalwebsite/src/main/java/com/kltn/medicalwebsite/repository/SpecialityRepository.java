package com.kltn.medicalwebsite.repository;


import com.kltn.medicalwebsite.entity.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecialityRepository extends JpaRepository<Speciality,Long> {

    @Query("SELECT s FROM Speciality s " +
            "WHERE (:name IS NULL OR LOWER(s.name) LIKE LOWER(CONCAT('%', :name, '%')))")
    List<Speciality> findByNameContainingIgnoreCase(String name);
}
