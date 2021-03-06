package com.example.marianflanagan.paws.model;
/**
 * Created by marianflanagan
 * Student ID - x16119444
 */

public class Booking {

    String dogId;
    String customerId;
    String sitterId;
    String date;
    String time;

    public Booking() {

    }

    public Booking(String dogName, String customerId, String sitterId, String date, String time) {

        this.dogId = dogName;
        this.customerId = customerId;
        this.sitterId = sitterId;
        this.date = date;
        this.time = time;
    }

    public String getDogId() {
        return dogId;
    }

    public void setDogId(String dogId) {
        this.dogId = dogId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSitterId() {
        return sitterId;
    }

    public void setSitterId(String sitterId) {
        this.sitterId = sitterId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
