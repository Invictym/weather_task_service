package com.weather.service.model.utils;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YandexResponseParser {

    public static Optional<Double> getTemperatureFromResponse(String response) {
        Pattern p = Pattern.compile("weather__temp'>(\\S)(\\d+)\\S?<");
        Matcher m = p.matcher(response);
        if (m.find()) {
            int mn = m.group(1).equals("+") ? 1 : -1;
            return Optional.of(Double.parseDouble(m.group(2)) * mn);
        }
        return Optional.empty();
    }
}
