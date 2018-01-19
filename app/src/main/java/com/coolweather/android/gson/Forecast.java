package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/1/18.
 */

public class Forecast {
    @SerializedName("date")
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature{
        @SerializedName("min")
        public String min;
        @SerializedName("max")
        public String max;
    }
    @SerializedName("cond")
    public More more;

    public  class  More{
        @SerializedName("txt_d")
        public String info;
    }
}
