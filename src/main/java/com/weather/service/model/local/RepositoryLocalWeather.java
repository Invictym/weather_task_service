package com.weather.service.model.local;

import com.weather.service.log.Log;
import com.weather.service.model.db.WeatherRepository;
import com.weather.service.pojo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Optional;

@Service
public class RepositoryLocalWeather implements LocalWeather {

    private final WeatherRepository repository;

    @Autowired
    public RepositoryLocalWeather(WeatherRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Double> getTemperature() {
        Log.logger().info("Get today temperature");
        return repository.getTodayTemperature(new Date(System.currentTimeMillis()));
    }

    @Override
    public void saveWeather(Weather weather) {
        Log.logger().info("Save weather {} to db", weather);
        repository.save(weather);
    }
}
