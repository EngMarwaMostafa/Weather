package com.example.weatherr.RETROFIT;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("weather?appid=d5a3e048a41709a1a7a2f6eb52fdbbd3&units=metric")
    Call<Example> getWeatherData(@Query("q") String name) ;

}
