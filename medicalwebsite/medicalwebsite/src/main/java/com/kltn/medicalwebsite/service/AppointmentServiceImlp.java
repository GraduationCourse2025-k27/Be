package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.Appointment;
import com.kltn.medicalwebsite.entity.Doctor;
import com.kltn.medicalwebsite.entity.MedicalType;
import com.kltn.medicalwebsite.exception.AppointmentException;
import com.kltn.medicalwebsite.exception.DoctorException;
import com.kltn.medicalwebsite.repository.AppointmentRepository;
import com.kltn.medicalwebsite.repository.DoctorRepository;
import com.kltn.medicalwebsite.repository.MedicalTypeRepository;
import com.kltn.medicalwebsite.request.AppointmentRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class AppointmentServiceImlp implements  AppointmentService{

    private AppointmentRepository appointmentRepository;
    private DoctorRepository doctorRepository;
    private MedicalTypeRepository medicalTypeRepository;

    public AppointmentServiceImlp(AppointmentRepository appointmentRepository, DoctorRepository doctorRepository, MedicalTypeRepository medicalTypeRepository) {
        this.appointmentRepository = appointmentRepository;
        this.doctorRepository = doctorRepository;
        this.medicalTypeRepository = medicalTypeRepository;
    }

    @Override
    public void bookAppointment(Long ScheduleId, AppointmentRequest appointmentRequest) {
//        // Kiểm tra xem có ít nhất một trong hai ID tồn tại
//        if (doctorId == null && medicalTypeId == null) {
//            throw new AppointmentException("At least one of doctorId or medicalTypeId must be provided");
//        }
//        // Tìm Doctor và MedicalType
//        Optional<Doctor> existingDoctor = doctorId != null ? doctorRepository.findById(doctorId) : Optional.empty();
//        Optional<MedicalType> existingMedicalType = medicalTypeId != null ? medicalTypeRepository.findById(medicalTypeId) : Optional.empty();
//
//        // Kiểm tra xem có ít nhất một trong hai tồn tại
//        if (existingDoctor.isEmpty() && existingMedicalType.isEmpty()) {
//            throw new AppointmentException("Neither doctor nor medical type found");
//        }
//        // Tạo và gán thông tin cho Appointment
//        Appointment appointment = new Appointment();
//        mapAppointmentRequestToAppointment(appointment, appointmentRequest);
//        // Gán Doctor nếu có
//        existingDoctor.ifPresent(appointment::setDoctor);
//
//        // Gán MedicalType nếu có
//        existingMedicalType.ifPresent(appointment::setMedicalType);
//
//        // Lưu Appointment
//         appointment.setStatus("PENDING");
//        appointmentRepository.save(appointment);
    }
    private void mapAppointmentRequestToAppointment(Appointment appointment, AppointmentRequest request) {
        appointment.setAddress(request.getAddress());
        appointment.setFullName(request.getFullName());
        appointment.setTimeSlot(request.getTimeSlot());
        appointment.setGender(request.getGender());
        appointment.setPhone(request.getPhone());
        appointment.setIssueDescription(request.getIssueDescription());
        appointment.setEmail(request.getEmail());
        appointment.setDateAppointment(request.getDateAppointment());
        appointment.setBirthDate(request.getBirthDate());
    }
}
