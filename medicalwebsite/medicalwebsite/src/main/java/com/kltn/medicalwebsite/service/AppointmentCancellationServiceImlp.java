package com.kltn.medicalwebsite.service;


import com.kltn.medicalwebsite.entity.appointmentCancellation;
import com.kltn.medicalwebsite.repository.AppointmentCancellationRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentCancellationServiceImlp implements  AppointmentCancellationService{

    private AppointmentCancellationRepository cancellationRepository;

    public AppointmentCancellationServiceImlp(AppointmentCancellationRepository cancellationRepository) {
        this.cancellationRepository = cancellationRepository;
    }

    @Override
    public List<appointmentCancellation> getAllAppointmentCancellation() {
        return cancellationRepository.findAll()
                .stream()
                .filter(c -> c.getPayment() != null && "VnPay".equals(c.getPayment().getTypePayment()))
                .sorted(Comparator.comparing(appointmentCancellation::getId).reversed())
                .collect(Collectors.toList());
    }
}
