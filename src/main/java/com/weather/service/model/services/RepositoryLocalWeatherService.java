package com.weather.service.model.services;

import com.weather.service.log.Log;
import com.weather.service.model.services.base.LocalWeatherService;
import com.weather.service.model.db.WeatherRepository;
import com.weather.service.pojo.db.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Optional;

@Service
public class RepositoryLocalWeatherService implements LocalWeatherService {

    private final WeatherRepository repository;

    @Autowired
    public RepositoryLocalWeatherService(WeatherRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Long> getTemperature(String lat, String lon) {
        Log.logger().info("Get today temperature");
        return repository.getTodayTemperature(new Date(System.currentTimeMillis()));
    }

    @Override
    public void saveWeather(Weather weather) {
        Log.logger().info("Save weather {} to db", weather);
        //repository.save(weather);
    }
}
