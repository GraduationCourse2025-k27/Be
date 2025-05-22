package com.kltn.medicalwebsite.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class New {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @ManyToOne
    @JoinColumn(name = "id_customersupport",referencedColumnName = "id")
    @JsonBackReference
    private CustomerSupport customerSupport;

    private  String title;


    @Column(columnDefinition = "text")
    private  String content;

    private  String imagePath ;

    private LocalDateTime publisherAt;


    public New() {
    }

    public New(Long id, CustomerSupport customerSupport, String title, String content, String imagePath, LocalDateTime publisherAt) {
        this.id = id;
        this.customerSupport = customerSupport;
        this.title = title;
        this.content = content;
        this.imagePath = imagePath;
        this.publisherAt = publisherAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerSupport getCustomerSupport() {
        return customerSupport;
    }

    public void setCustomerSupport(CustomerSupport customerSupport) {
        this.customerSupport = customerSupport;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPublisherAt() {
        return publisherAt;
    }

    public void setPublisherAt(LocalDateTime publisherAt) {
        this.publisherAt = publisherAt;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
