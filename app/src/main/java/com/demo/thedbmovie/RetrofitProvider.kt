package com.demo.thedbmovie

import retrofit2.Retrofit

object RetrofitProvider {

    private const val BASE_URL = "https://api.themoviedb.org/3/"

    fun createRetrofitClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()
    }

    fun buildMovieApi(retrofit: Retrofit): MovieApi{
        return retrofit.create(MovieApi::class.java)
    }
}