package com.example.bottomnavigationbar.Healthy;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("bmi")

    public Call<Health> getHealth();
}
