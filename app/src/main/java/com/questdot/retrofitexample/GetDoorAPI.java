package com.questdot.retrofitexample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Belal on 11/5/2015.
 */
public interface GetDoorAPI {



    @POST("v2/57e55317110000e02481b1bf")
    Call<DoorResponse> postRawJson();

    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
            .create();
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://www.mocky.io/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();

    GetDoorAPI getDoorAPI = retrofit.create(GetDoorAPI.class);
}
