package com.weather.service.model.utils;

import com.weather.service.pojo.db.Weather;

import java.sql.Date;

public class WeatherUtil {

    private WeatherUtil(){}

    public static Weather createWeather(Long temperature) {
        Weather weather = new Weather();
        weather.setTemperature(temperature);
        weather.setSaveDate(new Date(System.currentTimeMillis()));
        return weather;
    }
}
