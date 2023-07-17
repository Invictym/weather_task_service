package com.weather.service.model.db;

import com.weather.service.pojo.db.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.Optional;

public interface WeatherRepository extends JpaRepository<Weather, Date> {

    @Query(value = "select value from weather_history where date = :date order by date desc LIMIT 1",
            nativeQuery = true)
    Optional<Long> getTodayTemperature(@Param("date") Date date);

}
