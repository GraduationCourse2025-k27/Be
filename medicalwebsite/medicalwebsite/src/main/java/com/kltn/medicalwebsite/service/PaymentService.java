package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.Payment;
import com.kltn.medicalwebsite.response.PaymentDTO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Map;

public interface PaymentService {

    Payment paymentAppointmentFoDoctorId(Long appointment,Double amount);

    Payment findPaymentById(Long id);

    PaymentDTO.VNPayResponse createVnPayPayment(HttpServletRequest request,Long amount,Long appointmentId);
    Map<String,Object> getCurrentYearRevenueStats();

}
