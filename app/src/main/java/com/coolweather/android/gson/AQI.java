package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/1/18.
 */

public class AQI {
    @SerializedName("city")
    public AQICity aqiCity;

    public class  AQICity{
             @SerializedName("aqi")
            public String aqi;
             @SerializedName("pm25")
            public String pm25;
    }

}
