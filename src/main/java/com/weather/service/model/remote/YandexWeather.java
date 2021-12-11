package com.weather.service.model.remote;

import com.weather.service.log.Log;
import com.weather.service.model.remote.http.Connector;
import com.weather.service.model.utils.YandexResponseParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class YandexWeather implements RemoteWeather {

    private final String url = "yandex.ru";
    private final Connector connector;

    @Autowired
    public YandexWeather(Connector connector) {
        this.connector = connector;
    }

    @Override
    public Optional<Double> getTemperature() {
        Log.logger().info("Get temperature from {}", url);
        return Optional.of(YandexResponseParser
                .getTemperatureFromResponse(connector.sendGet(url)));
    }
}
