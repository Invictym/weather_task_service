package com.weather.service.model.base;

import java.util.Optional;

public interface WeatherLoader {

    Optional<Double> getTemperature();
}
