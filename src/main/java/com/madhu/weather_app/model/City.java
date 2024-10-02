package com.madhu.weather_app.model;
//write a city model class with fields id. cityName, createdAt, updatedAt

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cityName;
    private String createdAt;
    private String updatedAt;

    public City(int id, String cityName, String createdAt, String updatedAt) {
        this.id = id;
        this.cityName = cityName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", cityName=" + cityName + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
}
