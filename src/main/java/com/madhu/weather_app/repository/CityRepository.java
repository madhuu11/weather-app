package com.madhu.weather_app.repository;
//create a repository interface for city model
import org.springframework.data.jpa.repository.JpaRepository;
import com.madhu.weather_app.model.City;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
