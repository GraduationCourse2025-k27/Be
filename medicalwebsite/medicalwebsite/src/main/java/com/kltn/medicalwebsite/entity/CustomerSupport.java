package com.kltn.medicalwebsite.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class CustomerSupport {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String imagePath;

    @OneToMany(mappedBy = "customerSupport",cascade = CascadeType.REMOVE)
    @JsonManagedReference
    private List<New> news;

    @ManyToOne
    @JoinColumn(name = "id_client" ,referencedColumnName = "id")
    private  Client client;

    @OneToMany(mappedBy = "customerSupport",cascade = CascadeType.REMOVE)
    private List<SupportQueue> supportQueues;

    public CustomerSupport() {
    }

    public CustomerSupport(Long id, String name, String phone, String address, String password, String imagePath, Client client) {
        this.id = id;
        this.imagePath = imagePath;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
