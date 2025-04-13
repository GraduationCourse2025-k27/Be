package com.kltn.medicalwebsite.request;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeSlotRequest {

    private String startTime;
    private String endTime;

    public TimeSlotRequest() {
    }

    public TimeSlotRequest(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
