package com.example.prakmobile9tugas.model

import com.google.gson.annotations.SerializedName

data class Hero(
    @SerializedName("result")
    val data: List<Data>
)
