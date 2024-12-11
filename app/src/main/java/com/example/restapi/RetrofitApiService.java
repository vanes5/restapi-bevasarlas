package com.example.restapi;

import com.example.restapi.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RetrofitApiService {

    // GET all users
    @GET("acttFJ/item")
    Call<List<Item>> getAllIitems();

    // GET user by ID
    @GET("acttFJ/item/{id}")
    Call<Item> getItemById(@Path("id") int id);

    // POST (create a new user)
    @POST("acttFJ/item")
    Call<Item> createItem(@Body Item item);

    // PUT (update a user)
    @PUT("acttFJ/item/{id}")
    Call<Item> updateItem(@Path("id") int id, @Body Item item);

    // DELETE (delete a user by ID)
    @DELETE("acttFJ/item/{id}")
    Call<Void> deleteItem(@Path("id") int id);
}
