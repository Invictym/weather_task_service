
package com.weather.service.pojo.yandex;

import com.google.gson.annotations.Expose;

public class Info {

    @Expose
    private Double lat;
    @Expose
    private Double lon;
    @Expose
    private String url;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
