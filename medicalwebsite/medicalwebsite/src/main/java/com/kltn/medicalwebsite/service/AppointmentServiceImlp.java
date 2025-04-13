package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.Appointment;
import com.kltn.medicalwebsite.entity.ConsultationSchedule;
import com.kltn.medicalwebsite.exception.ConsultationScheduleException;
import com.kltn.medicalwebsite.repository.AppointmentRepository;
import com.kltn.medicalwebsite.repository.ConsultationScheduleRepository;
import com.kltn.medicalwebsite.request.AppointmentRequest;
import org.springframework.stereotype.Service;


@Service
public class AppointmentServiceImlp implements  AppointmentService{

    private AppointmentRepository appointmentRepository;
    private ConsultationScheduleRepository consultationScheduleRepository;

    public AppointmentServiceImlp(AppointmentRepository appointmentRepository, ConsultationScheduleRepository consultationScheduleRepository) {
        this.appointmentRepository = appointmentRepository;
        this.consultationScheduleRepository = consultationScheduleRepository;
    }

    @Override
    public void bookAppointment(Long consultationSchedule, AppointmentRequest appointmentRequest) {
        ConsultationSchedule schedule = consultationScheduleRepository.findById(consultationSchedule).orElseThrow(
                () -> new ConsultationScheduleException("schedule not found with id :"+consultationSchedule)
        );

        if(schedule.getBooked()){
            throw  new ConsultationScheduleException("schedule have exist!");
        }
        Appointment appointment = new Appointment();
        appointment.setConsulationSchedule(schedule);
        appointment.setFullName(appointmentRequest.getFullName());
        appointment.setEmail(appointmentRequest.getEmail());
        appointment.setPhone(appointmentRequest.getPhone());
        appointment.setAddress(appointmentRequest.getAddress());
        appointment.setGender(appointmentRequest.getGender());
        appointment.setIssueDescription(appointmentRequest.getIssueDescription());
        appointment.setStatus("PENDING");
        schedule.setBooked(true);
        appointmentRepository.save(appointment);
        consultationScheduleRepository.save(schedule);
    }

}
