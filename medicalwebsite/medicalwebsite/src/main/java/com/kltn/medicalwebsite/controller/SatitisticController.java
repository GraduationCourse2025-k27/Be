package com.kltn.medicalwebsite.controller;


import com.kltn.medicalwebsite.entity.Review;
import com.kltn.medicalwebsite.response.StatisticResponse;
import com.kltn.medicalwebsite.response.Top5DoctorResponse;
import com.kltn.medicalwebsite.service.AppointmentService;
import com.kltn.medicalwebsite.service.PaymentService;
import com.kltn.medicalwebsite.service.ReviewService;
import com.kltn.medicalwebsite.service.StatisticService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/statistic")
public class SatitisticController {

    private StatisticService statisticService;

    private AppointmentService appointmentService;

    private PaymentService paymentService;

    private ReviewService reviewService;
    public SatitisticController(StatisticService statisticService, AppointmentService appointmentService, PaymentService paymentService, ReviewService reviewService) {
        this.statisticService = statisticService;
        this.appointmentService = appointmentService;
        this.paymentService = paymentService;
        this.reviewService = reviewService;
    }

    @GetMapping("/count")
    public ResponseEntity<StatisticResponse> countAll(){
        StatisticResponse statisticResponse = statisticService.CountByDoctorAndStaffAndMedicalServiceUseAndClient();
        return  new ResponseEntity<>(statisticResponse, HttpStatus.OK);
    }

    @GetMapping("/current-year")
    public  ResponseEntity<Map<String, Object>> getCurrentYearStats(){
        return  ResponseEntity.ok(appointmentService.getCurrentYearStats());
    }

    @GetMapping("/revenue/current-year")
    public  ResponseEntity<Map<String,Object>> getCurrentYearRevenueStats(){
        return  ResponseEntity.ok(paymentService.getCurrentYearRevenueStats());
    }

    @GetMapping("/reviews/Top5")
    public  ResponseEntity<List<Top5DoctorResponse>> getAllTop5DoctorBest(){
        List<Top5DoctorResponse> reviews = reviewService.findAllReviewsOrderByDoctorAvgRateDesc();
        try {
            if(reviews.isEmpty()){
                return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }else {
                return  new ResponseEntity<>(reviews,HttpStatus.OK);
            }
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
