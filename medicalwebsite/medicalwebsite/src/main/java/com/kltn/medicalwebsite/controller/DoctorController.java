package com.kltn.medicalwebsite.controller;


import com.kltn.medicalwebsite.entity.Doctor;
import com.kltn.medicalwebsite.request.DoctorCreate;
import com.kltn.medicalwebsite.request.DoctorRequest;
import com.kltn.medicalwebsite.service.DoctorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Doctor>> getAllDoctor(@RequestParam(value = "name",required = false)String name,@RequestParam(value = "id",required = false) Long idSpeciality){
        List<Doctor> doctors = doctorService.findAllByNameAndSpeciality(name,idSpeciality);
        if(doctors.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return  new ResponseEntity<>(doctors,HttpStatus.OK);
        }
    }
    @PostMapping("/create")
    public  ResponseEntity<Doctor> create(@RequestBody DoctorCreate doctor){
        Doctor newDoctor = doctorService.create(doctor);
        return  new ResponseEntity<>(newDoctor,HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public  ResponseEntity<Doctor> update(@RequestBody DoctorRequest doctorRequest,@PathVariable("id") Long id){
        Doctor updateDoctor = doctorService.update(doctorRequest,id);
        return  new ResponseEntity<>(updateDoctor,HttpStatus.OK);
    }

    @GetMapping("/search/{id}")
    public  ResponseEntity<Doctor> findDoctorById(@PathVariable("id")Long id){
        Doctor findByDoctor = doctorService.findDoctorById(id);
        return  new ResponseEntity<>(findByDoctor,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<String> deleteDoctorById(@PathVariable("id")Long id){
        String findByDoctor = doctorService.delete(id);
        return  new ResponseEntity<>(findByDoctor,HttpStatus.OK);
    }



}
