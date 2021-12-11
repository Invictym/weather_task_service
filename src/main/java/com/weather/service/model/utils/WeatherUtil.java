package com.weather.service.model.utils;

import com.weather.service.pojo.Weather;

import java.sql.Date;

public class WeatherUtil {

    public static Weather createWeather(Double temperature) {
        Weather weather = new Weather();
        weather.setTemperature(temperature);
        weather.setSaveDate(new Date(System.currentTimeMillis()));
        return weather;
    }
}
