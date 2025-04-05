package com.kltn.medicalwebsite.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Speciality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(50)")
    private  String name;

    private LocalDateTime createAt;

    @OneToMany(mappedBy = "speciality",cascade = CascadeType.REMOVE)
    private List<Doctor> doctors;

    public Speciality() {
    }

    public Speciality(Long id, String name, LocalDateTime createAt) {
        this.id = id;
        this.name = name;
        this.createAt = createAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }
}
