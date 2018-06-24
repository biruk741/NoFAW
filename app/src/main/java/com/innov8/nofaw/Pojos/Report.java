package com.innov8.nofaw.Pojos;

/**
 * Created by Biruk on 6/25/2018.
 */

public class Report {
    String longtitude;
    String latitude;
    String city;
    String name;
    String phoneNumber;
    String senderId;

    public Report(){}

    public Report(String longtitude, String latitude, String city, String name, String phoneNumber, String senderId) {
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.city = city;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.senderId = senderId;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
}
