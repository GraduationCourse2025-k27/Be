package com.kltn.medicalwebsite.controller;


import com.kltn.medicalwebsite.entity.CustomerSupport;
import com.kltn.medicalwebsite.request.CustomerSupportCreate;
import com.kltn.medicalwebsite.request.CustomerSupportUpdate;
import com.kltn.medicalwebsite.service.CustomerSupportService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customersupport")
public class CustomerController {


    private CustomerSupportService customerSupportService;

    public CustomerController(CustomerSupportService customerSupportService) {
        this.customerSupportService = customerSupportService;
    }


    @GetMapping("/list")
    public ResponseEntity<List<CustomerSupport>> getAllCustomerSupportByName(@RequestParam(required = false,value = "fullName")String name){
        List<CustomerSupport> customerSupports = customerSupportService.findAllCustomerSupportByName(name);
        if (customerSupports.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return  new ResponseEntity<>(customerSupports,HttpStatus.OK);
        }
    }

    @PostMapping("/create")
    public  ResponseEntity<CustomerSupport> createCustomerSupport(@RequestBody CustomerSupportCreate customerSupport){
        CustomerSupport newCustomerSupport = customerSupportService.createCustomerSupport(customerSupport);
        if(newCustomerSupport != null){
            return  new ResponseEntity<>(newCustomerSupport,HttpStatus.CREATED);
        }else {
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{id}")
    public  ResponseEntity<CustomerSupport> updateCustomerSupport(@RequestBody CustomerSupportUpdate customerSupport,@PathVariable("id")Long id){
        CustomerSupport newCustomerSupport = customerSupportService.updateCustomerSupport(customerSupport,id);
        if(newCustomerSupport != null){
            return  new ResponseEntity<>(newCustomerSupport,HttpStatus.OK);
        }else {
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/find/{id}")
    public  ResponseEntity<CustomerSupport> findCustomerSupportById(@PathVariable("id")Long id){
        CustomerSupport newCustomerSupport = customerSupportService.findCustomerSupportById(id);
        if(newCustomerSupport != null){
            return  new ResponseEntity<>(newCustomerSupport,HttpStatus.OK);
        }else {
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<String> deleteCustomerSupportById(@PathVariable("id")Long id){
        String newCustomerSupport = customerSupportService.deleteCustomerSupportById(id);
        if(newCustomerSupport.isEmpty()){
            return  ResponseEntity.notFound().build();
        }else {
            return  ResponseEntity.ok("Xóa thành công :"+id);

        }

    }

}
