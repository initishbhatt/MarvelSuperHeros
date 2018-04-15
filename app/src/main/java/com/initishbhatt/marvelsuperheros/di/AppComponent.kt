package com.initishbhatt.marvelsuperheros.di

import com.initishbhatt.marvelsuperheros.MarvelSuperHerosApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * @author nitishbhatt
 */
@Singleton
@Component(modules = [AppModule::class, ApiModule::class, NetworkModule::class,
    ActivityBuilder::class,
    AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<MarvelSuperHerosApp> {
    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        @BindsInstance
        fun application(application: MarvelSuperHerosApp): Builder
    }
}