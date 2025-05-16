package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.repository.ClientRepository;
import com.kltn.medicalwebsite.repository.CustomerSupportRepository;
import com.kltn.medicalwebsite.repository.DoctorRepository;
import com.kltn.medicalwebsite.repository.MedicalTypeRepository;
import com.kltn.medicalwebsite.response.StatisticResponse;
import org.springframework.stereotype.Service;


@Service
public class StatisticServiceImlp implements  StatisticService{


     private MedicalTypeRepository medicalTypeRepository;
     private ClientRepository clientRepository;
     private DoctorRepository doctorRepository;
     private CustomerSupportRepository customerSupportRepository;

    public StatisticServiceImlp(MedicalTypeRepository medicalTypeRepository, ClientRepository clientRepository, DoctorRepository doctorRepository, CustomerSupportRepository customerSupportRepository) {
        this.medicalTypeRepository = medicalTypeRepository;
        this.clientRepository = clientRepository;
        this.doctorRepository = doctorRepository;
        this.customerSupportRepository = customerSupportRepository;
    }

    @Override
    public StatisticResponse CountByDoctorAndStaffAndMedicalServiceUseAndClient() {
        StatisticResponse statisticResponse = new StatisticResponse();
        Long countDoctor = doctorRepository.countByDoctor();
        Long countClient = clientRepository.countByClient();
        Long countMedicalType = medicalTypeRepository.countByMedicalServiceUse();
        Long countStaff = customerSupportRepository.CountByCustomerSupport();
        statisticResponse.setCountDoctor(countDoctor);
        statisticResponse.setCountStaff(countStaff);
        statisticResponse.setCountUser(countClient);
        statisticResponse.setMedicalService(countMedicalType);
        return statisticResponse;
    }
}
