package com.initishbhatt.marvelsuperheros.di

import com.initishbhatt.marvelsuperheros.interactor.MarvelInteractor
import com.initishbhatt.marvelsuperheros.interactor.MarvelInteractorImpl
import com.initishbhatt.marvelsuperheros.util.HashGenerator
import com.initishbhatt.marvelsuperheros.util.HashGeneratorImpl
import com.initishbhatt.marvelsuperheros.util.SchedulerProvider
import com.initishbhatt.marvelsuperheros.util.SchedulersProviderImpl
import dagger.Module
import dagger.Provides

/**
 * @author nitishbhatt
 */
@Module
class AppModule {

    @Provides
    fun provideHelpers(hashGenerator: HashGeneratorImpl): HashGenerator = hashGenerator

    @Provides
    fun provideSchedulers(providerImpl: SchedulersProviderImpl): SchedulerProvider = providerImpl

    @Provides
    fun provideMainRepository(interactor: MarvelInteractorImpl): MarvelInteractor = interactor
}