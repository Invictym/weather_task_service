package com.weather.service.pojo;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "weather_history")
public class Weather {
    @Column(name = "weather_value")
    private double temperature;
    @Id
    @OrderBy("DESC")
    @Column(name = "weather_date")
    private Date saveDate;
}
