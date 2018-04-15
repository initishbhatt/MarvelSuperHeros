package com.initishbhatt.marvelsuperheros.characters.di

import com.initishbhatt.marvelsuperheros.characters.MainViewModel
import com.initishbhatt.marvelsuperheros.interactor.MarvelInteractor
import com.initishbhatt.marvelsuperheros.util.SchedulerProvider
import dagger.Module
import dagger.Provides

/**
 * @author nitishbhatt
 */
@Module
class MainActivityModule {
    @Provides
    fun provideViewModel(interactor: MarvelInteractor, schedulerProvider: SchedulerProvider) =
            MainViewModel(interactor, schedulerProvider)
}