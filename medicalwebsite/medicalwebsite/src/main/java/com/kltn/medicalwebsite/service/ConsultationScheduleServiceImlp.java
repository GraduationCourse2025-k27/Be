package com.kltn.medicalwebsite.service;


import com.kltn.medicalwebsite.entity.ConsultationSchedule;
import com.kltn.medicalwebsite.entity.Doctor;
import com.kltn.medicalwebsite.exception.DoctorException;
import com.kltn.medicalwebsite.repository.ConsultationScheduleRepository;
import com.kltn.medicalwebsite.repository.DoctorRepository;
import com.kltn.medicalwebsite.request.TimeSlotRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ConsultationScheduleServiceImlp implements ConsultationScheduleService {


    private ConsultationScheduleRepository consultationScheduleRepository;

    private DoctorRepository doctorRepository;

    public ConsultationScheduleServiceImlp(ConsultationScheduleRepository consultationScheduleRepository, DoctorRepository doctorRepository) {
        this.consultationScheduleRepository = consultationScheduleRepository;
        this.doctorRepository = doctorRepository;
    }

    @Override
    public void createTimeSlot(Long doctorId, LocalDate workDate, List<TimeSlotRequest> timeSlotRequests) {
        Doctor doctor =  doctorRepository.findById(doctorId).orElseThrow(() -> new DoctorException("Doctor not found :"+doctorId));

        for (TimeSlotRequest timeSlotRequest : timeSlotRequests){
            ConsultationSchedule schedule = new ConsultationSchedule();
            LocalTime startTime = LocalTime.parse(timeSlotRequest.getStartTime());
            LocalTime endTime = LocalTime.parse(timeSlotRequest.getEndTime());
            schedule.setDoctor(doctor);
            schedule.setBooked(false);
            schedule.setStartTime(startTime);
            schedule.setEndTime(endTime);
            schedule.setDateAppointment(workDate);
            consultationScheduleRepository.save(schedule);
        }
    }

    @Override
    public List<ConsultationSchedule> findAllTimeSlotByDoctor(Long doctorId) {
        Optional<Doctor> doctor = doctorRepository.findById(doctorId);
        if(doctor.isPresent()){
              List<ConsultationSchedule> schedule = consultationScheduleRepository.findScheduleByDoctorId(doctorId);
               schedule = schedule.stream().sorted(Comparator.comparing(ConsultationSchedule::getDateAppointment)).collect(Collectors.toList());
               return  schedule;
        }else {
            throw  new DoctorException("doctor not found with id :"+doctorId);
        }
    }

    @Override
    public void updateTimeSlot(Long consultationSchedule, TimeSlotRequest timeSlotRequest,LocalDate workDate) {

    }

    @Override
    public void deleteTimeSlotById(Long consultationScheduleId) {

    }
}
