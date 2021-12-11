package com.weather.service.model.local;

import com.weather.service.model.base.WeatherService;
import com.weather.service.pojo.Weather;

public interface LocalWeatherService extends WeatherService {

    void saveWeather(Weather weather);
}
