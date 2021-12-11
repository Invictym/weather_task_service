package com.weather.service.model.base;

import java.util.Optional;

public interface WeatherService {

    Optional<Double> getTemperature();
}
