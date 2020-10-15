package com.example.a121020intern;


import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("/api/json/get/cfUDQFeWSq?indent=2")
    Call<Example> getAllData();

}
