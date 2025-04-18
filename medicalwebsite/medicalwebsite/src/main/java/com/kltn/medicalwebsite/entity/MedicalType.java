package com.kltn.medicalwebsite.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class MedicalType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String imagePath;

    @Column(columnDefinition = "varchar(120)")
    private  String nameService;

    private LocalDateTime createAt;

    private  Double price;

    private  String description;


    @OneToMany(mappedBy = "medicalType",cascade = CascadeType.REMOVE)
    private List<ConsultationSchedule> consultationSchedules;

    public MedicalType(String imagePath, Double price) {
        this.imagePath = imagePath;
        this.price = price;
    }

    public MedicalType(Long id, String nameService, LocalDateTime createAt, Integer flagMedicalType, String imagePath, Double price, String description) {
        this.id = id;
        this.nameService = nameService;
        this.createAt = createAt;
        this.imagePath = imagePath;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }


    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }


    public List<ConsultationSchedule> getConsultationSchedules() {
        return consultationSchedules;
    }

    public void setConsultationSchedules(List<ConsultationSchedule> consultationSchedules) {
        this.consultationSchedules = consultationSchedules;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
