package com.kltn.medicalwebsite.repository;

import com.kltn.medicalwebsite.entity.New;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NewsRepository extends JpaRepository<New, Long> {


    @Query("select n from New n Where n.customerSupport.id =:supportId ")
    public List<New> getNewsByCustomerSupportId(@Param("supportId") Long customerSupportId);
}
