package com.jledesma.moviesapp.data.networking.service

import com.jledesma.moviesapp.data.dto.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MethodApi {

    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(
        @Query("api_key") apiKey:String,
        @Query("language") language:String = "es",
        @Query("page") page:Int = 1
    ) : Response<MovieResponse>

}

