package com.hayankhrisna.catapihayan.service;

import com.hayankhrisna.catapihayan.model.Joke;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JokesService {
    @GET("/floof/")
    Call<Joke> getRandomJoke();
}
