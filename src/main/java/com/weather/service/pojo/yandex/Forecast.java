
package com.weather.service.pojo.yandex;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecast {

    @Expose
    private String date;
    @SerializedName("date_ts")
    private Long dateTs;
    @SerializedName("moon_code")
    private Long moonCode;
    @SerializedName("moon_text")
    private String moonText;
    @Expose
    private List<Part> parts;
    @Expose
    private String sunrise;
    @Expose
    private String sunset;
    @Expose
    private Long week;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getDateTs() {
        return dateTs;
    }

    public void setDateTs(Long dateTs) {
        this.dateTs = dateTs;
    }

    public Long getMoonCode() {
        return moonCode;
    }

    public void setMoonCode(Long moonCode) {
        this.moonCode = moonCode;
    }

    public String getMoonText() {
        return moonText;
    }

    public void setMoonText(String moonText) {
        this.moonText = moonText;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Long getWeek() {
        return week;
    }

    public void setWeek(Long week) {
        this.week = week;
    }

}
