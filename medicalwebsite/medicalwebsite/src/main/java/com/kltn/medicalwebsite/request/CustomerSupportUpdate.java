package com.kltn.medicalwebsite.request;

public class CustomerSupportUpdate {


    private  String imagePath;
    private  String fullName;
    private  String phone;
    private  String address;


    public CustomerSupportUpdate() {
    }

    public CustomerSupportUpdate(String imagePath, String fullName, String phone, String address) {
        this.imagePath = imagePath;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
}
