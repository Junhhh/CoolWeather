package com.coolweather.android.gson;

import android.text.style.UpdateLayout;

import com.google.gson.annotations.SerializedName;

public class Basic {

    /*{
        "HeWeather": [
                {
                    "basic":{
                        "cid":"CN101280908",
                            "location":"高要",
                            "parent_city":"肇庆",
                            "admin_area":"广东",
                            "cnty":"中国",
                            "lat":"23.0276947",
                            "lon":"112.46084595",
                            "tz":"+8.00",
                            "city":"高要",
                            "id":"CN101280908",
                            "update":{
                                "loc":"2018-10-17 15:45",
                                "utc":"2018-10-17 07:45"}},
                    "update":{"loc":"2018-10-17 15:45","utc":"2018-10-17 07:45"},
                    "status":"ok",
                    "now":{"cloud":"75","cond_code":"104","cond_txt":"阴","fl":"23","hum":"81","pcpn":"0.0","pres":"1012","tmp":"22","vis":"10","wind_deg":"12","wind_dir":"东北风","wind_sc":"2","wind_spd":"9","cond":{"code":"104","txt":"阴"}},
                    "daily_forecast":[{"date":"2018-10-17","cond":{"txt_d":"阵雨"},"tmp":{"max":"24","min":"18"}},{"date":"2018-10-18","cond":{"txt_d":"阴"},"tmp":{"max":"26","min":"18"}},{"date":"2018-10-19","cond":{"txt_d":"阴"},"tmp":{"max":"28","min":"20"}}],
                    "aqi":{"city":{"aqi":"20","pm25":"12","qlty":"优"}},
                    "suggestion":{"comf":{"type":"comf","brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"},"sport":{"type":"sport","brf":"较不宜","txt":"有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"},"cw":{"type":"cw","brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"}}}]}*/

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
