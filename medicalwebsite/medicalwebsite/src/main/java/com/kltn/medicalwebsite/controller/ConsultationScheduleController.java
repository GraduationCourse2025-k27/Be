package com.kltn.medicalwebsite.controller;


import com.kltn.medicalwebsite.entity.ConsultationSchedule;
import com.kltn.medicalwebsite.request.TimeSlotRequest;
import com.kltn.medicalwebsite.service.ConsultationScheduleService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/consultationSchedule")
public class ConsultationScheduleController {


    private ConsultationScheduleService consultationScheduleService;

    public ConsultationScheduleController(ConsultationScheduleService consultationScheduleService) {
        this.consultationScheduleService = consultationScheduleService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createSchedule(@RequestParam("doctorId") Long doctorId,
                                                 @RequestParam("date") @DateTimeFormat(pattern = "dd-MM-yyyy")LocalDate date,
                                                 @RequestBody List<TimeSlotRequest> slots){
        consultationScheduleService.createTimeSlot(doctorId,date,slots);
        return  ResponseEntity.ok("Tạo Khung giờ thành công");
    }

    @GetMapping("/getAllScheduleByDoctorId/{doctorId}")
    public  ResponseEntity<List<ConsultationSchedule>> getAllScheduleByDoctorId(@PathVariable("doctorId")Long doctorId){
        List<ConsultationSchedule> schedules = consultationScheduleService.findAllTimeSlotByDoctor(doctorId);
        if(schedules.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return  new ResponseEntity<>(schedules,HttpStatus.OK);
        }
    }
}
