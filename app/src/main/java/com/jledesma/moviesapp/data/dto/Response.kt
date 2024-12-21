package com.jledesma.moviesapp.data.dto

data class MovieResponse(
    val results:List<MovieDto>
)

data class MovieDto(
    val id:Int
)