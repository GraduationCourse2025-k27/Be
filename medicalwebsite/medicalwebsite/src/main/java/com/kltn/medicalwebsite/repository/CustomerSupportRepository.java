package com.kltn.medicalwebsite.repository;

import com.kltn.medicalwebsite.entity.CustomerSupport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerSupportRepository extends JpaRepository<CustomerSupport,Long> {


    @Query("Select Count(*) from CustomerSupport ")
    Long CountByCustomerSupport();
}
