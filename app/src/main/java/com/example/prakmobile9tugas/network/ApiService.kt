package com.example.prakmobile9tugas.network

// ApiService.kt
import android.content.ClipData
import com.example.prakmobile9tugas.model.Hero
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("data.php")
    fun getItems(): Call<Hero>
}
