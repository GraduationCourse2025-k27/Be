package com.kltn.medicalwebsite.response;

public class AppointmentStatisticsResponse {
    private  String period;
    private  Long totalAppointments;

    public AppointmentStatisticsResponse() {
    }

    public AppointmentStatisticsResponse(String period, Long totalAppointments) {
        this.period = period;
        this.totalAppointments = totalAppointments;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Long getTotalAppointments() {
        return totalAppointments;
    }

    public void setTotalAppointments(Long totalAppointments) {
        this.totalAppointments = totalAppointments;
    }
}
