package com.weather.service.model.remote;

import com.weather.service.log.Log;
import com.weather.service.model.remote.http.ConnectorService;
import com.weather.service.model.utils.YandexResponseParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class YandexWeatherService implements RemoteWeatherService {

    private final String url = "yandex.ru";
    private final ConnectorService connectorService;

    @Autowired
    public YandexWeatherService(ConnectorService connectorService) {
        this.connectorService = connectorService;
    }

    @Override
    public Optional<Double> getTemperature() {
        Log.logger().info("Get temperature from {}", url);
        return Optional.of(YandexResponseParser
                .getTemperatureFromResponse(connectorService.sendGet(url)));
    }
}
