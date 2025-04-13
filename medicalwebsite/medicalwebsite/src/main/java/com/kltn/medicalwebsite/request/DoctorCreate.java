package com.kltn.medicalwebsite.request;

public class DoctorCreate {

    private String imagePath;
    private  Long client;
    private  Long speciality;
    private  String workDay;
    private  String description;


    public DoctorCreate(String imagePath, Long client, Long speciality, String workDay, String description) {
        this.imagePath = imagePath;
        this.client = client;
        this.speciality = speciality;
        this.workDay = workDay;
        this.description = description;
    }

    public DoctorCreate() {
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Long getClient() {
        return client;
    }

    public void setClient(Long client) {
        this.client = client;
    }

    public Long getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Long speciality) {
        this.speciality = speciality;
    }

    public String getWorkDay() {
        return workDay;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
