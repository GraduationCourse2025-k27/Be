package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.CustomerSupport;
import com.kltn.medicalwebsite.request.CustomerSupportCreate;
import com.kltn.medicalwebsite.request.CustomerSupportUpdate;

import java.util.List;

public interface CustomerSupportService {


    List<CustomerSupport> findAllCustomerSupportByName(String name);
    CustomerSupport createCustomerSupport(CustomerSupportCreate customerSupport);
    CustomerSupport updateCustomerSupport(CustomerSupportUpdate customerSupport,Long id);
    CustomerSupport findCustomerSupportById(Long id);
    String deleteCustomerSupportById(Long id);

}
