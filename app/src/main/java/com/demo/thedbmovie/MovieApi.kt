package com.demo.thedbmovie

import com.demo.thedbmovie.dto.ResultsDTO
import retrofit2.http.GET

interface MovieApi {

    @GET("movie/top_rated?api_key=82f2b6263315aeea520c31a1b67553d6")
    suspend fun getTopRated() : ResultsDTO
}