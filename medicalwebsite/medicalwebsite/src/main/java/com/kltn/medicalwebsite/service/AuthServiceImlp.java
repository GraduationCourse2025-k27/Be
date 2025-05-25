package com.kltn.medicalwebsite.service;


import com.kltn.medicalwebsite.entity.Client;
import com.kltn.medicalwebsite.entity.CustomerSupport;
import com.kltn.medicalwebsite.entity.Doctor;
import com.kltn.medicalwebsite.exception.ClientException;
import com.kltn.medicalwebsite.repository.ClientRepository;
import com.kltn.medicalwebsite.repository.CustomerSupportRepository;
import com.kltn.medicalwebsite.repository.DoctorRepository;
import com.kltn.medicalwebsite.request.ChangePasswordRequest;
import com.kltn.medicalwebsite.request.ForgotPasswordRequest;
import com.kltn.medicalwebsite.request.LoginRequest;
import com.kltn.medicalwebsite.request.RegisterRequest;
import com.kltn.medicalwebsite.response.AuthResponse;
import com.kltn.medicalwebsite.util.JwtUtil;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class AuthServiceImlp  implements  AuthService{


    private ClientRepository clientRepository;
    private DoctorRepository doctorRepository;
    private CustomerSupportRepository customerSupportRepository;
    private PasswordEncoder passwordEncoder;
    private JwtUtil jwtUtil;
    private EmailSenderService emailSenderService;

    public AuthServiceImlp(ClientRepository clientRepository, DoctorRepository doctorRepository, CustomerSupportRepository customerSupportRepository, PasswordEncoder passwordEncoder, JwtUtil jwtUtil, EmailSenderService emailSenderService) {
        this.clientRepository = clientRepository;
        this.doctorRepository = doctorRepository;
        this.customerSupportRepository = customerSupportRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
        this.emailSenderService = emailSenderService;
    }

    @Override
    public AuthResponse register(RegisterRequest request) {
        Client client = new Client();
        client.setFullName(request.getFullName());
        client.setEmail(request.getEmail());
        client.setPhone(request.getPhone());
        client.setAddress(request.getAddress());
        client.setPassword(passwordEncoder.encode(request.getPassword()));
        client.setRole("ROLE_USER");
        client.setClock(false);
        client.setCreatedAt(LocalDateTime.now());
        clientRepository.save(client);

        String jwt = jwtUtil.generateToken(new User(client.getEmail(),client.getPassword(),new ArrayList<>()));

        AuthResponse authResponse = new AuthResponse();
        authResponse.setId(client.getId());
        authResponse.setFullName(client.getFullName());
        authResponse.setEmail(client.getEmail());
        authResponse.setPhone(client.getPhone());
        authResponse.setAddress(client.getAddress());
        authResponse.setRole(client.getRole());
        authResponse.setJwt(jwt);
        return authResponse;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        Client client = clientRepository.findClientByEmail(request.getEmail());
        if(client == null || !passwordEncoder.matches(request.getPassword(),client.getPassword())){
            throw  new ClientException("invalid password or email");
        }
        if(client.getClock()){
            throw  new ClientException("this account clock!");
        }
        String jwt = jwtUtil.generateToken(new User(client.getEmail(),client.getPassword(),new ArrayList<>()));
        Long id;
        if("ROLE_DOCTOR".equals(client.getRole())){
            Doctor doctor = doctorRepository.findByClient(client);
            id = doctor.getId();
        } else if ("ROLE_STAFF".equals(client.getRole())) {
            CustomerSupport cs = customerSupportRepository.findByClient(client);
            id = cs.getId();
        }else {
            id = client.getId();
        }
        AuthResponse response = new AuthResponse();
        response.setId(id);
        response.setFullName(client.getFullName());
        response.setEmail(client.getEmail());
        response.setPhone(client.getPhone());
        response.setAddress(client.getAddress());
        response.setRole(client.getRole());
        response.setJwt(jwt);
        return response;
    }

    @Override
    public void changePassword(Long id, ChangePasswordRequest request) {
        Client client = clientRepository.findById(id).orElseThrow(() -> new ClientException("Client not found"));

        if(!passwordEncoder.matches(request.getCurrentPassword(),client.getPassword())){
            throw  new ClientException("invalid password current");
        }
        client.setPassword(passwordEncoder.encode(request.getNewPassword()));
        clientRepository.save(client);

    }

    @Override
    public void forgotPassword(ForgotPasswordRequest forgotPasswordRequest) {
        Client client = clientRepository.findClientByEmail(forgotPasswordRequest.getEmail());
        if(client == null){
            throw new ClientException("Email not exist");
        }
        String defaultPassword = "4810A2";
        client.setPassword(passwordEncoder.encode(defaultPassword));
        clientRepository.save(client);
        emailSenderService.sendEmail("hophuctam@dtu.edu.vn","Mật khẩu mới","Mật khẩu mới của bạn là :"+defaultPassword);

    }
}
