package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.Appointment;
import com.kltn.medicalwebsite.request.AppointmentRequest;
import com.kltn.medicalwebsite.response.MyAppointmentResponse;

import java.util.List;
import java.util.Map;

public interface AppointmentService {

    Appointment bookAppointment(Long ShceduleId, AppointmentRequest appointmentRequest);
    Appointment findAppointmentById(Long appointmentId);

    void statusConfirmAppointmentById(Long id);
    Boolean statusCancelAppointmentById(Long id);
    void deleteAppointmentById(Long id);
    void statusCompleteAppointmentById(Long id);
    List<Appointment> findAllAppointmentForPending(String email);
    List<Appointment> findAllAppointmentForConfirm(String email);
    List<MyAppointmentResponse> findAllAppointmentByEmail(String email);
    List<Appointment> findAllAppointment();
    void deleteUnpaidAppointments();
    Map<String, Object> getCurrentYearStats();

    List<Appointment> getConfirmedAppointmentsByDoctorId(Long doctorId);
}
