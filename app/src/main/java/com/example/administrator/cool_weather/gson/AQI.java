package com.example.administrator.cool_weather.gson;

/**
 * Created by Administrator on 2017/2/26 0026.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
