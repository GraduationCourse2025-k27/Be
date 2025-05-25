package com.kltn.medicalwebsite.service;


import com.kltn.medicalwebsite.request.ChangePasswordRequest;
import com.kltn.medicalwebsite.request.ForgotPasswordRequest;
import com.kltn.medicalwebsite.request.LoginRequest;
import com.kltn.medicalwebsite.request.RegisterRequest;
import com.kltn.medicalwebsite.response.AuthResponse;

public interface AuthService {


    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
    void changePassword(Long id, ChangePasswordRequest request);
    void forgotPassword(ForgotPasswordRequest forgotPasswordRequest);
}
