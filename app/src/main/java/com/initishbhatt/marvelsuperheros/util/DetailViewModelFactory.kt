package com.initishbhatt.marvelsuperheros.util

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.initishbhatt.marvelsuperheros.characters.model.MarvelSuperHeroes
import com.initishbhatt.marvelsuperheros.detail.DetailViewModel

@Suppress("UNCHECKED_CAST")
/**
 * @author nitishbhatt
 */
class DetailViewModelFactory(private var superHeroes: MarvelSuperHeroes) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java))
            return DetailViewModel(superHeroes) as T
        throw IllegalArgumentException("Unknown viewModel class")
    }
}