package com.madhu.weather_app.repository;
//create a repository interface for weather audit model
import org.springframework.data.jpa.repository.JpaRepository;
import com.madhu.weather_app.model.WeatherAudit;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherAuditRepository extends JpaRepository<WeatherAudit, Integer> {
}