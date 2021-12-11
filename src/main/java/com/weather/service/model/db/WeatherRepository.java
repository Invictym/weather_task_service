package com.weather.service.model.db;

import com.weather.service.pojo.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.Optional;

public interface WeatherRepository extends JpaRepository<Weather, Date> {

    @Query(value = "select weather_value from weather_history where weather_date = :date order by weather_date desc LIMIT 1",
            nativeQuery = true)
    Optional<Double> getTodayTemperature(@Param("date") Date date);

}
