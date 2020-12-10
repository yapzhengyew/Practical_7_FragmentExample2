package com.example.a161120community.api;

import com.example.a161120community.model.Example;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("api/json/get/ceTGySaVrC?indent=2")
    Call<Example> getAllData();
}
