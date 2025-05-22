package com.kltn.medicalwebsite.controller;


import com.kltn.medicalwebsite.entity.Client;
import com.kltn.medicalwebsite.repository.ClientRepository;
import com.kltn.medicalwebsite.request.ClientRequest;
import com.kltn.medicalwebsite.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {



    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientRepository clientRepository;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Client>> getAllClient(){
        List<Client> clients = clientService.findALl();
        if(clients.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return  new ResponseEntity<>(clients,HttpStatus.OK);
        }
    }

    @PostMapping("/register")
    public  ResponseEntity<Client> register(@RequestBody ClientRequest clientRequest){
        Client registerClient = clientService.register(clientRequest);
        return  ResponseEntity.ok(registerClient);
    }

    @PutMapping("/update/{id}")
    public  ResponseEntity<String> update(@PathVariable("id") Long id ,@RequestBody ClientRequest client){
        clientService.updateClient(client,id);
        return  ResponseEntity.ok("Update Client:"+id + "Success");
    }
    @GetMapping("/search/email")
    public  ResponseEntity<Client> findClientByEmail(@RequestParam("email") String email){
        Client client  = clientService.findClientByEmail(email);
        return  new ResponseEntity<>(client,HttpStatus.OK);
    }
    @GetMapping("/search/{id}")
    public  ResponseEntity<Client> findClientByEmail(@PathVariable("id") Long id){
        Client client  = clientService.findClientById(id);
        return  new ResponseEntity<>(client,HttpStatus.OK);
    }

    @GetMapping("/valid/email")
    public  ResponseEntity<?> validEmailExisting(@RequestParam("email") String email){
        List<Client> clients = clientService.findALl();
        for (Client client : clients){
            if(client.getEmail().equals(email)){
                return  new ResponseEntity<>(HttpStatus.OK);
            }
        }
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/role-user")
    public ResponseEntity<List<Client>> getClientsByRoleUser(){
        try {
            List<Client> clients = clientService.findUserByRoleUser();
            if(clients.isEmpty()){
                return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }else {
                return  new ResponseEntity<>(clients,HttpStatus.OK);
            }
        }catch (Exception e){
             return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PutMapping("/{id}/lock")
    public ResponseEntity<String> lockAccount(@PathVariable Long id){
        Client client = clientService.findClientById(id);

        client.setClock(true);
        clientRepository.save(client);
        return  ResponseEntity.ok("Tài khoản với ID:"+id+"Đã bị khóa");
    }

    @PutMapping("/{id}/unlock")
    public ResponseEntity<String> unLockAccount(@PathVariable Long id){
        Client client = clientService.findClientById(id);

        client.setClock(false);
        clientRepository.save(client);
        return  ResponseEntity.ok("Tài khoản với ID:"+id+"Đã mở khóa");
    }

    @GetMapping("/getAccounts")
    public  ResponseEntity<List<Client>> getAccountsByName(@RequestParam(value = "fullName",required = false)String name){
        List<Client> clients = clientService.findByFullNameContainingIgnoreCaseOrFullNameIsNull(name);
        if(clients.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return  new ResponseEntity<>(clients,HttpStatus.OK);
        }
    }



}
