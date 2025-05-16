package com.kltn.medicalwebsite.response;

import com.kltn.medicalwebsite.entity.Doctor;

public class Top5DoctorResponse {
    private Doctor doctorId;
    private  Double averageRate;

    public Top5DoctorResponse() {
    }

    public Top5DoctorResponse(Doctor doctorId, Double averageRate) {
        this.doctorId = doctorId;
        this.averageRate = averageRate;
    }

    public Doctor getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Doctor doctorId) {
        this.doctorId = doctorId;
    }

    public Double getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(Double averageRate) {
        this.averageRate = averageRate;
    }
}
