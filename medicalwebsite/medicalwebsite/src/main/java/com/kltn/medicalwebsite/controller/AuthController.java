package com.kltn.medicalwebsite.controller;


import com.kltn.medicalwebsite.request.ChangePasswordRequest;
import com.kltn.medicalwebsite.request.ForgotPasswordRequest;
import com.kltn.medicalwebsite.request.LoginRequest;
import com.kltn.medicalwebsite.request.RegisterRequest;
import com.kltn.medicalwebsite.response.AuthResponse;
import com.kltn.medicalwebsite.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return  ResponseEntity.ok(authService.register(request));
    }
    @PostMapping("/login")
    public  ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
        return  ResponseEntity.ok(authService.login(request));
    }
    @PostMapping("/change-password")
    public  ResponseEntity<?> changePassword(@RequestParam("id")Long id, @RequestBody ChangePasswordRequest request){
        authService.changePassword(id,request);
        return  ResponseEntity.ok("Đổi mật khẩu thành công");
    }
    @PostMapping("/forgot-password")
    public  ResponseEntity<?> forgotPassword(@RequestBody ForgotPasswordRequest request){
        authService.forgotPassword(request);
        return  ResponseEntity.ok("Mật khẩu mới đã được gửi qua email");
    }

}
