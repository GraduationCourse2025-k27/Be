package com.kltn.medicalwebsite.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Appointment {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

      @ManyToOne
      @JoinColumn(name = "id_consulationSchedule",referencedColumnName = "id")
    private ConsultationSchedule consulationSchedule;

      private  String fullName;
      private  String email;
      private  String phone;
      private  String address;
      private  String gender;
      private  String issueDescription;
      private  String status;


      @OneToMany(mappedBy = "appointment",cascade = CascadeType.REMOVE)
      private List<Payment> payments;

    public Appointment() {
    }

    public Appointment(Long id, ConsultationSchedule consulationSchedule, String fullName, String email, String phone, String address, String gender, String issueDescription, String status) {
        this.id = id;
        this.consulationSchedule = consulationSchedule;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.issueDescription = issueDescription;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ConsultationSchedule getConsulationSchedule() {
        return consulationSchedule;
    }

    public void setConsulationSchedule(ConsultationSchedule consulationSchedule) {
        this.consulationSchedule = consulationSchedule;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
