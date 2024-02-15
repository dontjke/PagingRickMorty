package com.stepanov.pagingrickmorty.repository

import com.stepanov.pagingrickmorty.repository.dto.ResponseApi
import com.stepanov.pagingrickmorty.utils.Constants.END_POINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(END_POINT)
    suspend fun loadValue(@Query("page") page: Int): Response<ResponseApi>
}


