package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/1/18.
 */

public class Country extends DataSupport {

    private  int  id;
    private  String conutryName;
    private  String weatherId;
    private  int  cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConutryName() {
        return conutryName;
    }

    public void setConutryName(String conutryName) {
        this.conutryName = conutryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
