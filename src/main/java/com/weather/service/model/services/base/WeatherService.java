package com.weather.service.model.services.base;

import java.util.Optional;

public interface WeatherService {

    Optional<Double> getTemperature();
}
