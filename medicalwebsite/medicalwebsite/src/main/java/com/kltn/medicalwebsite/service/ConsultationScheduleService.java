package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.ConsultationSchedule;
import com.kltn.medicalwebsite.request.TimeSlotRequest;
import com.kltn.medicalwebsite.request.UpdateScheduleRequest;

import java.time.LocalDate;
import java.util.List;

public interface ConsultationScheduleService {

    void createTimeSlot (Long doctorId, LocalDate workDate, List<TimeSlotRequest> timeSlotRequests);
    List<ConsultationSchedule> findAllTimeSlotByDoctor(Long doctorId);
    void updateTimeSlot(Long consultationSchedule, UpdateScheduleRequest timeSlotRequest);
    void deleteTimeSlotById(Long consultationScheduleId);

}
