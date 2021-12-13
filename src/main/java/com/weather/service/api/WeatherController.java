package com.weather.service.api;

import com.weather.service.model.local.LocalWeatherService;
import com.weather.service.model.remote.RemoteWeatherService;
import com.weather.service.model.utils.WeatherUtil;
import com.weather.service.pojo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public class WeatherController {

    private final RemoteWeatherService remoteWeatherService;
    private final LocalWeatherService localWeatherService;

    @Autowired
    public WeatherController(RemoteWeatherService remoteWeatherService, LocalWeatherService localWeatherService) {
        this.remoteWeatherService = remoteWeatherService;
        this.localWeatherService = localWeatherService;
    }

    @GetMapping("/weather")
    public String getWeatherToday() {
        Optional<Double> temp = localWeatherService.getTemperature();
        if (temp.isPresent()) {
            return temp.get() + "";
        }
        try {
            Weather weather = WeatherUtil.createWeather(remoteWeatherService.getTemperature().orElseThrow(RuntimeException::new));
            localWeatherService.saveWeather(weather);
            return weather.getTemperature() + "";
        } catch (RuntimeException ex) {
            return "cannot load temperature";
        }
    }
}
