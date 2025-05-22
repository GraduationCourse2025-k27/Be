package com.kltn.medicalwebsite.request;

public class NewRequest {
    private  Long customerSupportId;
    private String content;
    private  String title;
    private  String imagePath;


    public NewRequest() {
    }

    public NewRequest(Long customerSupportId, String content, String title, String imagePath) {
        this.customerSupportId = customerSupportId;
        this.content = content;
        this.title = title;
        this.imagePath = imagePath;
    }

    public Long getCustomerSupportId() {
        return customerSupportId;
    }

    public void setCustomerSupportId(Long customerSupportId) {
        this.customerSupportId = customerSupportId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
