package com.weather.service.model.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YandexResponseParser {

    public static double getTemperatureFromResponse(String response) {
        Pattern p = Pattern.compile("weather__temp'>([+,-])(\\d+)\\S?<");
        Matcher m = p.matcher(response);
        if (m.find()) {
            int mn = m.group(1).equals("+") ? 1 : -1;
            return Double.parseDouble(m.group(2)) * mn;
        }
        return 0;
    }
}
