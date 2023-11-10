package com.example.prakmobile9tugas

// ApiService.kt
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("data.php")
    fun getItems(): Call<List<Item>>
}
