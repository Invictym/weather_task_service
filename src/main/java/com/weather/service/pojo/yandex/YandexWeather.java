
package com.weather.service.pojo.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YandexWeather {

    @Expose
    private Fact fact;
    @Expose
    private Forecast forecast;
    @Expose
    private Info info;
    @Expose
    private Long now;
    @SerializedName("now_dt")
    private String nowDt;

    public Fact getFact() {
        return fact;
    }

    public void setFact(Fact fact) {
        this.fact = fact;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Long getNow() {
        return now;
    }

    public void setNow(Long now) {
        this.now = now;
    }

    public String getNowDt() {
        return nowDt;
    }

    public void setNowDt(String nowDt) {
        this.nowDt = nowDt;
    }

}
