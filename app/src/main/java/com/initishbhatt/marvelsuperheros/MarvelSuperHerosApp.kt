package com.initishbhatt.marvelsuperheros

import com.initishbhatt.marvelsuperheros.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * @author nitishbhatt
 */
class MarvelSuperHerosApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
            DaggerAppComponent.builder().application(this).build()

}