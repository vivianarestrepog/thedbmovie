package com.demo.thedbmovie

import com.demo.thedbmovie.dto.ResultsDTO
import retrofit2.http.GET

interface MovieApi {

    @GET("movie/top_rated?api_key=db80907638a956c685da0d15765bc647")
    suspend fun getTopRated() : ResultsDTO
}