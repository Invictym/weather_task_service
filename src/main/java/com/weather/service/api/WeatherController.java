package com.weather.service.api;

import com.weather.service.model.services.base.WeatherService;
import com.weather.service.model.services.base.LocalWeatherService;
import com.weather.service.model.utils.WeatherUtil;
import com.weather.service.pojo.db.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public class WeatherController {

    private final WeatherService remoteWeatherService;
    private final LocalWeatherService localWeatherService;
    private String lat = "55.0076219";
    private String lon = "58.2400443";

    @Autowired
    public WeatherController(@Qualifier("yandexWebService") WeatherService remoteWeatherService,
                             LocalWeatherService localWeatherService) {
        this.remoteWeatherService = remoteWeatherService;
        this.localWeatherService = localWeatherService;
    }

    @GetMapping("/weather")
    public String getWeatherToday() {
        Optional<Long> temp = localWeatherService.getTemperature(lat, lon);
        if (temp.isPresent()) {
            return "{ \"temperature\":\"" + temp.get() + "\"}";
        }
        try {
            Weather weather = WeatherUtil.createWeather(remoteWeatherService.getTemperature(lat, lon).orElseThrow(RuntimeException::new));
            localWeatherService.saveWeather(weather);
            return "{ \"temperature\":\"" + weather.getTemperature() + "\"}";
        } catch (RuntimeException ex) {
            System.out.println(ex);
            return "{ \"temperature\":\"+17\"}";
        }
    }
}
