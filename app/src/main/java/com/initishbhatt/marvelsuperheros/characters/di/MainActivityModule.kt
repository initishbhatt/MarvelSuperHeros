package com.initishbhatt.marvelsuperheros.characters.di

import com.initishbhatt.marvelsuperheros.interactor.MarvelInteractor
import com.initishbhatt.marvelsuperheros.util.MainViewModelFactory
import com.initishbhatt.marvelsuperheros.util.SchedulerProvider
import dagger.Module
import dagger.Provides

/**
 * @author nitishbhatt
 */
@Module
class MainActivityModule {
    @Provides
    fun provideViewModelFactory(interactor: MarvelInteractor, schedulerProvider: SchedulerProvider) =
            MainViewModelFactory(interactor, schedulerProvider)

   /* @Provides
    fun provideDetailViewModelFactory(superHeroes: MarvelSuperHeroes) =
            DetailViewModelFactory(superHeroes)*/
}