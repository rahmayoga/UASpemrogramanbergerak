package com.example.belajarapi;

import com.example.belajarapi.Model.ModelDataIndonesia;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("indonesia")
    Call<List<ModelDataIndonesia>> getData();
}
