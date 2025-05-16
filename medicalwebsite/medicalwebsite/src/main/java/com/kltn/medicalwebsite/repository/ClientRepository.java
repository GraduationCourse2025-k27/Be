package com.kltn.medicalwebsite.repository;


import com.kltn.medicalwebsite.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository  extends JpaRepository<Client,Long> {


    @Query("select c from Client c where c.email =:email")
    Client findClientByEmail(@Param("email") String email);

    @Query("select count(*) from Client c where c.role = 'ROLE_USER'")
    Long countByClient();


    @Query("Select c from Client c where c.role ='ROLE_USER'")
    List<Client> getAllClientByRoleUser();

}
