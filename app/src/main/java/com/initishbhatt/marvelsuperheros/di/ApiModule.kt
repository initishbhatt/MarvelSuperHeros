package com.initishbhatt.marvelsuperheros.di

import com.initishbhatt.marvelsuperheros.api.MarvelService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * @author nitishbhatt
 */
@Module
class ApiModule {
    @Provides
    @Singleton
    fun provideMarvelService(retrofit: Retrofit): MarvelService {
        return retrofit.create(MarvelService::class.java)
    }
}