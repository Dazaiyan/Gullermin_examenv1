package com.example.gullermin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface RetrofitAPI {
    @POST("/users")

        //on below line we are creating a method to post our data.
    Call<DataModal> createPost(@Body DataModal dataModal);
}
