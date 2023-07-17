package com.weather.service.model.utils;

import com.weather.service.log.Log;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YandexResponseParser {

    private YandexResponseParser() {}

    public static Optional<Double> getTemperatureFromResponse(String response) {
        Pattern p = Pattern.compile("currentWeather-1P\">(\\S)?(\\d+)\\S?<");
        Matcher m = p.matcher(response);
        Log.logger().info(response);
        if (m.find()) {
            int mn = m.group(1).equals("+") ? 1 : -1;
            return Optional.of(Double.parseDouble(m.group(2)) * mn);
        }
        return Optional.empty();
    }
}