package com.weather.service.model.local;

import com.weather.service.model.base.WeatherLoader;
import com.weather.service.pojo.Weather;

public interface LocalWeather extends WeatherLoader {

    void saveWeather(Weather weather);
}
