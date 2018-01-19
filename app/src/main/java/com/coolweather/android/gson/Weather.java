package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2018/1/18.
 */

public class Weather {
    @SerializedName("status")
    public String status;
    @SerializedName("aqi")
    public AQI aqi;
    @SerializedName("basic")
    public Basic basic;
    @SerializedName("now")
    public Now now;
    @SerializedName("suggestion")
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
