package com.kltn.medicalwebsite.controller;


import com.kltn.medicalwebsite.request.AppointmentRequest;
import com.kltn.medicalwebsite.service.AppointmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {


    private AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/reserve")
    public ResponseEntity<?> reserveAppointment(@RequestParam("scheduleId") Long scheduleId,
                                                @RequestBody AppointmentRequest appointmentRequest
                                                ){
        appointmentService.bookAppointment(scheduleId,appointmentRequest);
        return  ResponseEntity.ok("Dat lich thanh cong");
    }
}
