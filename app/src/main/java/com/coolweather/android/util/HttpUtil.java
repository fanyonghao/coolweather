package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/1/18.
 */

public class HttpUtil {

    public  static  void  sendOkHttpRequest(String url,okhttp3.Callback callback){
        OkHttpClient  okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(callback);
    }

}
