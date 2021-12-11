package com.weather.service.api;

import com.weather.service.model.local.LocalWeather;
import com.weather.service.model.remote.RemoteWeather;
import com.weather.service.model.utils.WeatherUtil;
import com.weather.service.pojo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public class WeatherController {

    private final RemoteWeather call;
    private final LocalWeather localWeather;

    @Autowired
    public WeatherController(RemoteWeather call, LocalWeather localWeather) {
        this.call = call;
        this.localWeather = localWeather;
    }

    @GetMapping("/weather")
    public String getWeatherToday() {
        Optional<Double> temp = localWeather.getTemperature();
        if (temp.isPresent()) {
            return temp.get() + "";
        }
        try {
            Weather weather = WeatherUtil.createWeather(call.getTemperature().orElseThrow(RuntimeException::new));
            localWeather.saveWeather(weather);
            return weather.getTemperature() + "";
        } catch (RuntimeException ex) {
            return "cannot load temperature";
        }
    }
}
