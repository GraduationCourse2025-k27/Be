package com.kltn.medicalwebsite.repository;

import com.kltn.medicalwebsite.entity.Client;
import com.kltn.medicalwebsite.entity.CustomerSupport;
import com.kltn.medicalwebsite.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerSupportRepository extends JpaRepository<CustomerSupport,Long> {


    @Query("Select Count(*) from CustomerSupport ")
    Long CountByCustomerSupport();


    @Query("SELECT cs FROM CustomerSupport cs WHERE cs.client IS NOT NULL AND cs.client.fullName LIKE %:fullName%")
    List<CustomerSupport> findByCustomerSupportByName(@Param("fullName") String name);

    CustomerSupport findByClient(Client client);

}
