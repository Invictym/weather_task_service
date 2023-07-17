package com.weather.service.model.services;

import com.weather.service.log.Log;
import com.weather.service.model.services.base.WeatherService;
import com.weather.service.pojo.yandex.YandexWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
public class YandexWebService implements WeatherService {

    private final WebClient webClient;

    @Autowired
    public YandexWebService(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Optional<Long> getTemperature(String lat, String lon) {
        Log.logger().info("Get temperature from {}", "");
        return Optional.of(webClient.get()
                .uri(uriBuilder -> uriBuilder.queryParam("lat", lat).queryParam("lon", lon).build())
                .header("X-Yandex-API-Key", "a86b8a9b-1d6a-44b3-85f5-2014f37e51e9")
                .retrieve()
                .bodyToMono(YandexWeather.class)
                .block().getFact().getTemp());
    }
}
