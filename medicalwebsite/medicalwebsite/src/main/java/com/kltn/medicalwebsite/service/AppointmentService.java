package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.request.AppointmentRequest;

public interface AppointmentService {

    void bookAppointment(Long consultationSchedule, AppointmentRequest appointmentRequest);
}
