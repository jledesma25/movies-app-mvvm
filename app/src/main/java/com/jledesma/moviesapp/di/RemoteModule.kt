package com.jledesma.moviesapp.di

import com.jledesma.moviesapp.BuildConfig
import com.jledesma.moviesapp.data.networking.service.MethodApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteModule {

    @Provides
    @Singleton
    fun provideRetrofit() : MethodApi = Retrofit.Builder()
        .baseUrl(BuildConfig.URL_BASE)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create()

}