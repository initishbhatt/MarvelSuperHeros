package com.initishbhatt.marvelsuperheros.di

import android.app.Application
import android.content.Context
import com.initishbhatt.marvelsuperheros.interactor.MarvelInteractor
import com.initishbhatt.marvelsuperheros.interactor.MarvelInteractorImpl
import com.initishbhatt.marvelsuperheros.util.HashGenerator
import com.initishbhatt.marvelsuperheros.util.HashGeneratorImpl
import com.initishbhatt.marvelsuperheros.util.SchedulerProvider
import com.initishbhatt.marvelsuperheros.util.SchedulersProviderImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author nitishbhatt
 */
@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: Application): Context = application.applicationContext

    @Provides
    fun provideHelpers(hashGenerator: HashGeneratorImpl): HashGenerator = hashGenerator

    @Provides
    fun provideSchedulers(providerImpl: SchedulersProviderImpl): SchedulerProvider = providerImpl

    @Provides
    fun provideMainRepository(interactor: MarvelInteractorImpl): MarvelInteractor = interactor
}