package com.kltn.medicalwebsite.service;


import com.kltn.medicalwebsite.entity.Client;
import com.kltn.medicalwebsite.entity.Doctor;
import com.kltn.medicalwebsite.entity.Review;
import com.kltn.medicalwebsite.exception.ClientException;
import com.kltn.medicalwebsite.exception.DoctorException;
import com.kltn.medicalwebsite.repository.ClientRepository;
import com.kltn.medicalwebsite.repository.DoctorRepository;
import com.kltn.medicalwebsite.repository.ReviewRepository;
import com.kltn.medicalwebsite.request.ReviewRequest;
import com.kltn.medicalwebsite.response.Top5DoctorResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewServiceImlp  implements  ReviewService{

    private ReviewRepository  reviewRepository;
    private ClientRepository clientRepository;
    private DoctorRepository doctorRepository;

    public ReviewServiceImlp(ReviewRepository reviewRepository, ClientRepository clientRepository, DoctorRepository doctorRepository) {
        this.reviewRepository = reviewRepository;
        this.clientRepository = clientRepository;
        this.doctorRepository = doctorRepository;
    }


    @Override
    public Review assess(ReviewRequest review) {
        Client client = clientRepository.findById(review.getClientId()).orElseThrow(() -> new ClientException("client not found with id:"+review.getClientId()));
        Doctor doctor = doctorRepository.findById(review.getDoctorId()).orElseThrow(() -> new DoctorException("Doctor not found with id :"+review.getDoctorId()));
        Review saveReview = new Review();
        saveReview.setDateReview(LocalDateTime.now());
        saveReview.setClient(client);
        saveReview.setDoctor(doctor);
        saveReview.setRate(review.getRate());
        saveReview.setContent(review.getContent());
        return reviewRepository.save(saveReview);
    }

    @Override
    public List<Review> findAllReviewByDoctorId(Long doctorId) {
        List<Review> reviews = reviewRepository.findByDoctorId(doctorId);
        return reviews;
    }

    @Override
    public List<Top5DoctorResponse> findAllReviewsOrderByDoctorAvgRateDesc() {
        List<Top5DoctorResponse> Top5Reviews = reviewRepository.FindTop5Doctor();
        Top5Reviews = Top5Reviews.stream().limit(5).collect(Collectors.toList());
        return  Top5Reviews;
    }
}
