package com.kltn.medicalwebsite.response;

public class StatisticResponse {
    private Long countDoctor;
    private  Long countStaff;
    private  Long countUser;
    private  Long medicalService;

    public Long getCountDoctor() {
        return countDoctor;
    }

    public void setCountDoctor(Long countDoctor) {
        this.countDoctor = countDoctor;
    }

    public Long getCountUser() {
        return countUser;
    }

    public void setCountUser(Long countUser) {
        this.countUser = countUser;
    }

    public Long getCountStaff() {
        return countStaff;
    }

    public void setCountStaff(Long countStaff) {
        this.countStaff = countStaff;
    }

    public Long getMedicalService() {
        return medicalService;
    }

    public void setMedicalService(Long medicalService) {
        this.medicalService = medicalService;
    }

    public StatisticResponse() {
    }

    public StatisticResponse(Long countDoctor, Long countStaff, Long countUser, Long medicalService) {
        this.countDoctor = countDoctor;
        this.countStaff = countStaff;
        this.countUser = countUser;
        this.medicalService = medicalService;
    }
}
