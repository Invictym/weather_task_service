package com.weather.service.model.services;

import com.weather.service.log.Log;
import com.weather.service.model.services.base.WeatherService;
import com.weather.service.model.http.HttpConnector;
import com.weather.service.model.utils.YandexResponseParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class YandexWebService implements WeatherService {

    private static final String URL = "yandex.ru";
    private final HttpConnector httpConnector;

    @Autowired
    public YandexWebService(HttpConnector httpConnector) {
        this.httpConnector = httpConnector;
    }

    @Override
    public Optional<Double> getTemperature() {
        Log.logger().info("Get temperature from {}", URL);
        return YandexResponseParser
                .getTemperatureFromResponse(httpConnector.sendGet(URL));
    }
}
