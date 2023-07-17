
package com.weather.service.pojo.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Part {

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
    @SerializedName("part_name")
    private String partName;
    @Expose
    private Boolean polar;
    @SerializedName("prec_mm")
    private Double precMm;
    @SerializedName("prec_period")
    private Long precPeriod;
    @SerializedName("prec_prob")
    private Long precProb;
    @SerializedName("pressure_mm")
    private Long pressureMm;
    @SerializedName("pressure_pa")
    private Long pressurePa;
    @SerializedName("temp_avg")
    private Long tempAvg;
    @SerializedName("temp_max")
    private Long tempMax;
    @SerializedName("temp_min")
    private Long tempMin;
    @SerializedName("wind_dir")
    private String windDir;
    @SerializedName("wind_gust")
    private Long windGust;
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

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Boolean getPolar() {
        return polar;
    }

    public void setPolar(Boolean polar) {
        this.polar = polar;
    }

    public Double getPrecMm() {
        return precMm;
    }

    public void setPrecMm(Double precMm) {
        this.precMm = precMm;
    }

    public Long getPrecPeriod() {
        return precPeriod;
    }

    public void setPrecPeriod(Long precPeriod) {
        this.precPeriod = precPeriod;
    }

    public Long getPrecProb() {
        return precProb;
    }

    public void setPrecProb(Long precProb) {
        this.precProb = precProb;
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

    public Long getTempAvg() {
        return tempAvg;
    }

    public void setTempAvg(Long tempAvg) {
        this.tempAvg = tempAvg;
    }

    public Long getTempMax() {
        return tempMax;
    }

    public void setTempMax(Long tempMax) {
        this.tempMax = tempMax;
    }

    public Long getTempMin() {
        return tempMin;
    }

    public void setTempMin(Long tempMin) {
        this.tempMin = tempMin;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Long getWindGust() {
        return windGust;
    }

    public void setWindGust(Long windGust) {
        this.windGust = windGust;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

}
