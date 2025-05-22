package com.kltn.medicalwebsite.request;

public class CustomerSupportCreate {

    private  String imagePath;
    private  Long clientId;


    public CustomerSupportCreate() {
    }
    public CustomerSupportCreate(String imagePath, Long clientId) {
        this.imagePath = imagePath;
        this.clientId = clientId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
