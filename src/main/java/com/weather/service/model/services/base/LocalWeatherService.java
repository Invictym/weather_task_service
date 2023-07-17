package com.weather.service.model.services.base;

import com.weather.service.pojo.db.Weather;

public interface LocalWeatherService extends WeatherService {

    void saveWeather(Weather weather);
}
