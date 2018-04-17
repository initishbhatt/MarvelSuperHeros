package com.initishbhatt.marvelsuperheros.detail.presentation.viewModel

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import com.initishbhatt.marvelsuperheros.characters.model.MarvelSuperHeroes

/**
 * @author nitishbhatt
 */
class DetailViewModel(var superHero: MarvelSuperHeroes) : ViewModel() {

    val name: ObservableField<String> = ObservableField(superHero.name)
    val description: ObservableField<String> = ObservableField(superHero.description)
    val imageUrl: ObservableField<String> = ObservableField(superHero.imageUrl)
}