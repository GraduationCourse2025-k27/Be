package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.Client;
import com.kltn.medicalwebsite.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private ClientRepository repository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Client client = repository.findClientByEmail(email);
        if (client == null){
            throw new UsernameNotFoundException("Không tìm thấy người dùng với email :"+email);
        }

        return new User(client.getEmail(), client.getPassword(),new ArrayList<>());
    }
}
