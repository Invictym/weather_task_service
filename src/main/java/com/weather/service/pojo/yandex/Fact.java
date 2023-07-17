
package com.weather.service.pojo.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fact {

    @Expose
    private String condition;
    @Expose
    private String daytime;
    @SerializedName("feels_like")
    private Long feelsLike;
    @Expose
    private Long humidity;
    @Expose
    private String icon;
    @SerializedName("obs_time")
    private Long obsTime;
    @Expose
    private Boolean polar;
    @SerializedName("pressure_mm")
    private Long pressureMm;
    @SerializedName("pressure_pa")
    private Long pressurePa;
    @Expose
    private String season;
    @Expose
    private Long temp;
    @SerializedName("wind_dir")
    private String windDir;
    @SerializedName("wind_gust")
    private Double windGust;
    @SerializedName("wind_speed")
    private Double windSpeed;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public Long getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Long feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Long getHumidity() {
        return humidity;
    }

    public void setHumidity(Long humidity) {
        this.humidity = humidity;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getObsTime() {
        return obsTime;
    }

    public void setObsTime(Long obsTime) {
        this.obsTime = obsTime;
    }

    public Boolean getPolar() {
        return polar;
    }

    public void setPolar(Boolean polar) {
        this.polar = polar;
    }

    public Long getPressureMm() {
        return pressureMm;
    }

    public void setPressureMm(Long pressureMm) {
        this.pressureMm = pressureMm;
    }

    public Long getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(Long pressurePa) {
        this.pressurePa = pressurePa;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Long getTemp() {
        return temp;
    }

    public void setTemp(Long temp) {
        this.temp = temp;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Double getWindGust() {
        return windGust;
    }

    public void setWindGust(Double windGust) {
        this.windGust = windGust;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

}
