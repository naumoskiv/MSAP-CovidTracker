package com.example.covidtracker.API;

import com.example.covidtracker.Data.AllCountries;
import com.example.covidtracker.Data.Countries;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CoronaService {

    @GET("countries/")
    Call<List<Countries>> getCountries();


    @GET("countries/{country}")
    Call<Countries> getCountryInfo(

            @Path("country") String country
    );

    @GET("all")
    Call<AllCountries> getAllCountries();
}