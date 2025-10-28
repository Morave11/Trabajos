package com.example.appinterface.Api

import com.example.appinterface.Cliente
import retrofit2.Call
import retrofit2.http.GET

interface ApiServicesKotlin {
    @GET("Detalles")
    fun getCliente(): Call<List<String>>
}