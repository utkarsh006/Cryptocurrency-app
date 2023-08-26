package com.example.crypto.data.remote.dto

import com.example.crypto.domain.model.Coin
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}

/* This is a Retrofit Api interface, we basically defines different functions and routes we want to
access from our api */