package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.ConsultationSchedule;
import com.kltn.medicalwebsite.request.TimeSlotRequest;

import java.time.LocalDate;
import java.util.List;

public interface ConsultationScheduleService {

    void createTimeSlot (Long doctorId, LocalDate workDate, List<TimeSlotRequest> timeSlotRequests);
    List<ConsultationSchedule> findAllTimeSlotByDoctor(Long doctorId);
    void updateTimeSlot(Long consultationSchedule,TimeSlotRequest timeSlotRequest,LocalDate workDay);
    void deleteTimeSlotById(Long consultationScheduleId);

}
