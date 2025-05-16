package com.kltn.medicalwebsite.response;

public class MedicalTypeReviewUsageResponse {
    private  Long idMedical;
    private  String nameService;
    private  Integer all;
    private  Integer good;
    private  Integer bad;

    public MedicalTypeReviewUsageResponse() {
    }

    public MedicalTypeReviewUsageResponse(Long idMedical, String nameService, Integer all, Integer good, Integer bad) {
        this.idMedical = idMedical;
        this.nameService = nameService;
        this.all = all;
        this.good = good;
        this.bad = bad;
    }

    public Long getIdMedical() {
        return idMedical;
    }

    public void setIdMedical(Long idMedical) {
        this.idMedical = idMedical;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }

    public Integer getGood() {
        return good;
    }

    public void setGood(Integer good) {
        this.good = good;
    }

    public Integer getBad() {
        return bad;
    }

    public void setBad(Integer bad) {
        this.bad = bad;
    }
}
