package com.coolweather.android.util;

import android.text.TextUtils;

import com.coolweather.android.db.City;
import com.coolweather.android.db.Country;
import com.coolweather.android.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2018/1/18.
 */

public class Utility {

    /**
     * 解析和处理服务器返回的省级数据
     */
    public  static  boolean  handleProvinceResponse(String response){

            if (!TextUtils.isEmpty(response)){
                try {
                    JSONArray  jsonArray = new JSONArray(response);
                    for (int i=0;i<jsonArray.length();i++){
                        JSONObject  jsonObject = jsonArray.getJSONObject(i);
                        Province province = new Province();
                        province.setProvinceCode(jsonObject.getInt("id"));
                        province.setProvinceName(jsonObject.getString("name"));
                        province.save();
                    }
                    return true;
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     */
    public  static  boolean  handleCityResponse(String response,int provinceId){

        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray  jsonArray = new JSONArray(response);
                for (int i=0;i<jsonArray.length();i++){
                    JSONObject  jsonObject = jsonArray.getJSONObject(i);
                    City city = new City();
                    city.setCityName(jsonObject.getString("name"));
                    city.setCityCode(jsonObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    /**
     * 解析和处理服务器返回的县级数据
     */
    public  static  boolean  handleCountryResponse(String response,int cityId){

        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray  jsonArray = new JSONArray(response);
                for (int i=0;i<jsonArray.length();i++){
                    JSONObject  jsonObject = jsonArray.getJSONObject(i);
                    Country country = new Country();
                    country.setConutryName(jsonObject.getString("name"));
                    country.setWeatherId(jsonObject.getString("weather_id"));
                    country.setCityId(cityId);
                    country.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

}
