package com.kltn.medicalwebsite.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class MedicalType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(120)")
    private  String nameService;




    private LocalDateTime createAt;


    @OneToMany(mappedBy = "medicalType",cascade = CascadeType.REMOVE)
    private List<ConsultationSchedule> consultationSchedules;

    public MedicalType() {
    }

    public MedicalType(Long id, String nameService, LocalDateTime createAt) {
        this.id = id;
        this.nameService = nameService;
        this.createAt = createAt;
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
}
