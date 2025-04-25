package com.kltn.medicalwebsite.request;

public class AppointmentRequest {

    private  String fullName;
    private  String email;
    private  String phone;
    private  String address;
    private  String gender;
    private  String issueDescription;
    private  String timeSlot;
    private  Long doctorId;
    private  Long medicalTypeId;
    private  String birthDate;
    private  String dateAppointment;

    public AppointmentRequest() {
    }
    public AppointmentRequest(String fullName, String email, String phone, String address, String gender, String issueDescription, String timeSlot, Long doctorId, Long medicalTypeId, String birthDate, String dateAppointment) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.issueDescription = issueDescription;
        this.timeSlot = timeSlot;
        this.doctorId = doctorId;
        this.medicalTypeId = medicalTypeId;
        this.birthDate = birthDate;
        this.dateAppointment = dateAppointment;
    }


    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getMedicalTypeId() {
        return medicalTypeId;
    }

    public void setMedicalTypeId(Long medicalTypeId) {
        this.medicalTypeId = medicalTypeId;
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

    public String getDateAppointment() {
        return dateAppointment;
    }

    public void setDateAppointment(String dateAppointment) {
        this.dateAppointment = dateAppointment;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
