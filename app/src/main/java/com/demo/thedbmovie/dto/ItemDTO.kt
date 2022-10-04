package com.demo.thedbmovie.dto

import com.google.gson.annotations.SerializedName

data class ItemDTO(
    @SerializedName("poster_path")
    val poster : String,
    @SerializedName("original_title")
    val title : String
)

