package com.madhu.weather_app.model;
//create a weather audit class to store weather audit details with fields id, cityId, enquiryType, enquiryAt

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WeatherAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cityId;
    private String enquiryType;
    private String enquiryAt;

    public WeatherAudit() {
    }

    public WeatherAudit(int id, int cityId, String enquiryType, String enquiryAt) {
        this.id = id;
        this.cityId = cityId;
        this.enquiryType = enquiryType;
        this.enquiryAt = enquiryAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getEnquiryType() {
        return enquiryType;
    }

    public void setEnquiryType(String enquiryType) {
        this.enquiryType = enquiryType;
    }

    public String getEnquiryAt() {
        return enquiryAt;
    }

    public void setEnquiryAt(String enquiryAt) {
        this.enquiryAt = enquiryAt;
    }

    @Override
    public String toString() {
        return "WeatherAudit [id=" + id + ", cityId=" + cityId + ", enquiryType=" + enquiryType + ", enquiryAt="
                + enquiryAt + "]";
    }
}
