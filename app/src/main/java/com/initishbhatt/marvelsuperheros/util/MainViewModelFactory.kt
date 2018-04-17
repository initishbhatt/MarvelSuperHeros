package com.initishbhatt.marvelsuperheros.util

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.initishbhatt.marvelsuperheros.characters.presentation.viewModel.MainViewModel
import com.initishbhatt.marvelsuperheros.interactor.MarvelInteractor

@Suppress("UNCHECKED_CAST")
/**
 * @author nitishbhatt
 */
class MainViewModelFactory(private val interactor: MarvelInteractor,
                           private val schedulerProvider: SchedulerProvider) : ViewModelProvider.Factory {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(interactor, schedulerProvider) as T
        }
        throw  IllegalArgumentException("Unknown ViewModel class")
    }
}