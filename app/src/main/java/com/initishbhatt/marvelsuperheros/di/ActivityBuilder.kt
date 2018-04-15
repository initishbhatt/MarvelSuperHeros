package com.initishbhatt.marvelsuperheros.di

import com.initishbhatt.marvelsuperheros.characters.MainActivity
import com.initishbhatt.marvelsuperheros.characters.di.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author nitishbhatt
 */
@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    internal abstract fun bindActivity(): MainActivity

}