package com.demo.thedbmovie.dto

import com.google.gson.annotations.SerializedName

data class ResultsDTO(
    @SerializedName("results")
    val results: List<ItemDTO>
)
