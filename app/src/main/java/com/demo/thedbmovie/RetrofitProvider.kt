package com.demo.thedbmovie

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitProvider {

    private const val BASE_URL = "https://api.themoviedb.org/3/"
    val movieApi: MovieApi

    init {
        val retrofitClient = createRetrofitClient()
        movieApi = buildMovieApi(retrofitClient)
    }

    private fun createRetrofitClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun buildMovieApi(retrofit: Retrofit): MovieApi {
        return retrofit.create(MovieApi::class.java)
    }
}