package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.Appointment;
import com.kltn.medicalwebsite.entity.ConsultationSchedule;
import com.kltn.medicalwebsite.entity.Doctor;
import com.kltn.medicalwebsite.entity.MedicalType;
import com.kltn.medicalwebsite.exception.AppointmentException;
import com.kltn.medicalwebsite.exception.ConsultationException;
import com.kltn.medicalwebsite.exception.DoctorException;
import com.kltn.medicalwebsite.repository.AppointmentRepository;
import com.kltn.medicalwebsite.repository.ConsultationScheduleRepository;
import com.kltn.medicalwebsite.repository.DoctorRepository;
import com.kltn.medicalwebsite.repository.MedicalTypeRepository;
import com.kltn.medicalwebsite.request.AppointmentRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class AppointmentServiceImlp implements AppointmentService {

    private AppointmentRepository appointmentRepository;

    private ConsultationScheduleRepository consultationScheduleRepository;


    private  EmailSenderService emailSenderService;

    public AppointmentServiceImlp(AppointmentRepository appointmentRepository, ConsultationScheduleRepository consultationScheduleRepository, EmailSenderService emailSenderService) {
        this.appointmentRepository = appointmentRepository;
        this.consultationScheduleRepository = consultationScheduleRepository;
        this.emailSenderService = emailSenderService;
    }

    @Override
    public Appointment bookAppointment(Long ScheduleId, AppointmentRequest appointmentRequest) {
        ConsultationSchedule consultationSchedule = consultationScheduleRepository.findById(ScheduleId).orElseThrow(() -> new ConsultationException("Schedule not found with id :" + ScheduleId));
        if(consultationSchedule.getBooked() == true){
            throw  new ConsultationException("schedule with :"+ScheduleId+" is booked");
        }
        Appointment appointment = mapAppointmentRequestToAppointment(appointmentRequest);
        appointment.setConsulationSchedule(consultationSchedule);
        appointment.setDateAppointment(LocalDateTime.now());
        appointment.setStatus("PENDING");
        consultationSchedule.setBooked(true);
        consultationScheduleRepository.save(consultationSchedule);
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment findAppointmentById(Long appointmentId) {
        Appointment appointment = appointmentRepository.findById(appointmentId).orElseThrow(() -> new AppointmentException("Appointment not found with id :" + appointmentId));
        return appointment;
    }


    @Override
    public void statusConfirmAppointmentById(Long id) {
        Appointment appointment = appointmentRepository.findById(id).orElseThrow(() -> new AppointmentException("Appointment not found with id :" + id));
        ConsultationSchedule schedule = consultationScheduleRepository.findById(appointment.getConsulationSchedule().getId()).orElseThrow(() -> new ConsultationException("schedule not found with id:"+id));
        appointment.setStatus("CONFIRMED");
        schedule.setBooked(true);
        emailSenderService.sendEmail("hophuctam@dtu.edu.vn",
                "Lịch hẹn khám bệnh cho "+ appointment.getFullName(),
                "Lịch khám của bạn đã được chấp nhận hãy đến theo khung giờ đã đặt từ "+schedule.getStartTime()+"-"+schedule.getEndTime()+" vào ngày "+schedule.getDateAppointment());
        consultationScheduleRepository.save(schedule);
        appointmentRepository.save(appointment);
    }

    @Override
    public void statusCancelAppointmentById(Long id) {
        Appointment appointment = appointmentRepository.findById(id).orElseThrow(() -> new AppointmentException("Appointment not found with id:" + id));
        ConsultationSchedule consultationSchedule = consultationScheduleRepository.
                findById(appointment.getConsulationSchedule().getId()).
                orElseThrow(() -> new AppointmentException("Schedule not found with id:" + appointment.getConsulationSchedule().getId()));
        appointment.setStatus("CANCELLED");
        consultationSchedule.setBooked(false);
        consultationScheduleRepository.save(consultationSchedule);
        appointmentRepository.save(appointment);
    }

    @Override
    public void deleteAppointmentById(Long id) {
        Appointment appointment = appointmentRepository.findById(id).orElseThrow(() -> new AppointmentException("Appointment not found with id :"+id));
        ConsultationSchedule consultationSchedule = consultationScheduleRepository.findById(appointment.getConsulationSchedule().getId()).orElseThrow(() -> new ConsultationException("Schedule not found with id :"+id));
        consultationSchedule.setBooked(false);
        consultationScheduleRepository.save(consultationSchedule);
        appointmentRepository.deleteById(appointment.getId());
    }

    @Override
    public void statusCompleteAppointmentById(Long id) {
        Appointment appointment = appointmentRepository.findById(id).orElseThrow(() -> new AppointmentException("Appointment not found with id:" + id));
        ConsultationSchedule consultationSchedule = consultationScheduleRepository.
                findById(appointment.getConsulationSchedule().getId()).
                orElseThrow(() -> new AppointmentException("Schedule not found with id:" + appointment.getConsulationSchedule().getId()));
        appointment.setStatus("COMPLETED");
        consultationSchedule.setBooked(false);
        consultationScheduleRepository.save(consultationSchedule);
        appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> findAllAppointmentForPending(String email) {
        List<Appointment> appointmentsPending = new ArrayList<>();
        if(email != null){
            List<Appointment> appointments = appointmentRepository.findByEmail(email);
            for (Appointment appointment : appointments){
                if(appointment.getStatus().equals("PENDING")){
                    appointmentsPending.add(appointment);
                }
            }
            return  appointmentsPending;
        }else {
            throw  new AppointmentException("Email not exsits!");
        }
    }

    @Override
    public List<Appointment> findAllAppointmentForConfirm(String email) {
        List<Appointment> appointmentsPending = new ArrayList<>();
        if(email != null){
            List<Appointment> appointments = appointmentRepository.findByEmail(email);
            for (Appointment appointment : appointments){
                if(appointment.getStatus().equals("CONFIRMED")){
                    appointmentsPending.add(appointment);
                }
            }
            return  appointmentsPending;
        }else {
            throw  new AppointmentException("Email not exsits!");
        }    }

    private Appointment mapAppointmentRequestToAppointment(AppointmentRequest request) {
        Appointment appointment = new Appointment();
        appointment.setAddress(request.getAddress());
        appointment.setFullName(request.getFullName());
        appointment.setGender(request.getGender());
        appointment.setPhone(request.getPhone());
        appointment.setIssueDescription(request.getIssueDescription());
        appointment.setEmail(request.getEmail());
        appointment.setBirthDate(request.getBirthDate());
        return appointment;
    }











}
