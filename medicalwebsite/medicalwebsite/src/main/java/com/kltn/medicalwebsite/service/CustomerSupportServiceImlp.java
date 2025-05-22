package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.Client;
import com.kltn.medicalwebsite.entity.CustomerSupport;
import com.kltn.medicalwebsite.exception.ClientException;
import com.kltn.medicalwebsite.repository.ClientRepository;
import com.kltn.medicalwebsite.repository.CustomerSupportRepository;
import com.kltn.medicalwebsite.request.CustomerSupportCreate;
import com.kltn.medicalwebsite.request.CustomerSupportUpdate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class CustomerSupportServiceImlp implements  CustomerSupportService{


    private CustomerSupportRepository customerSupportRepository;
    private ClientRepository clientRepository;

    public CustomerSupportServiceImlp(CustomerSupportRepository customerSupportRepository, ClientRepository clientRepository) {
        this.customerSupportRepository = customerSupportRepository;
        this.clientRepository = clientRepository;
    }

    @Override
    public List<CustomerSupport> findAllCustomerSupportByName(String name) {
        List<CustomerSupport> customerSupports = new ArrayList<>();
        if(name == null || name.trim().isEmpty()){
            customerSupports = customerSupportRepository.findAll().stream().sorted(Comparator.comparing(CustomerSupport::getId).reversed()).collect(Collectors.toList());
            return  customerSupports;
        }
        customerSupports = customerSupportRepository.findByCustomerSupportByName(name).stream().sorted(Comparator.comparing(CustomerSupport::getId).reversed()).collect(Collectors.toList());
        return customerSupports;
    }

    @Override
    public CustomerSupport createCustomerSupport(CustomerSupportCreate customerSupport) {
        Optional<Client> client = clientRepository.findById(customerSupport.getClientId());
        if(client.isPresent()){
            CustomerSupport newCustomerSupport = new CustomerSupport();
            Client updateClient = client.get();
            updateClient.setRole("ROLE_STAFF");
            newCustomerSupport.setImagePath(customerSupport.getImagePath());
            newCustomerSupport.setClient(updateClient);
            clientRepository.save(updateClient);
            return  customerSupportRepository.save(newCustomerSupport);
        }else {
            throw  new RuntimeException("create customerSupport fail");
        }
    }

    @Override
    @Transactional
    public CustomerSupport updateCustomerSupport(CustomerSupportUpdate customerSupport,Long id) {
        Optional<CustomerSupport> existingCustomerSupport = customerSupportRepository.findById(id);
        if(existingCustomerSupport.isPresent()){
            CustomerSupport newCustomerSupport = existingCustomerSupport.get();
            if(customerSupport.getImagePath() != null){
                newCustomerSupport.setImagePath(customerSupport.getImagePath());
            }
            Client client = newCustomerSupport.getClient();
            if(client != null){
                boolean clientUpdate= false;
                if(customerSupport.getFullName() != null){
                    client.setFullName(customerSupport.getFullName());
                    clientUpdate = true;
                }
                if(customerSupport.getAddress() != null){
                    client.setAddress(customerSupport.getAddress());
                    clientUpdate = true;
                }
                if(customerSupport.getPhone() != null){
                    client.setPhone(customerSupport.getPhone());
                    clientUpdate = true;
                }
                if(clientUpdate){
                    clientRepository.save(client);
                }

            }
           return customerSupportRepository.save(newCustomerSupport);
        }else {
            new RuntimeException("Customersupport not found with id :"+id);
        }
        return  null;
    }

    @Override
    public CustomerSupport findCustomerSupportById(Long id) {
        Optional<CustomerSupport> customerSupport = customerSupportRepository.findById(id);
        if(customerSupport.isPresent()){
            CustomerSupport foundCustomerSupport = customerSupport.get();
            return  foundCustomerSupport;
        }else {
            new RuntimeException("customersupport not found with id:"+id);
        }
        return  null;

    }

    @Override
    @Transactional
    public String deleteCustomerSupportById(Long id) {
        Optional<CustomerSupport> customerSupport = customerSupportRepository.findById(id);
        if(customerSupport.isPresent()){
            CustomerSupport newSupport = customerSupport.get();
            Client client = newSupport.getClient();
             customerSupportRepository.deleteById(newSupport.getId());
             clientRepository.deleteById(client.getId());
             return  "Delete customer support  :"+id + " success";
        }else {
            new RuntimeException("customersupport not found with id:"+id);
        }
        return "";
    }
}
