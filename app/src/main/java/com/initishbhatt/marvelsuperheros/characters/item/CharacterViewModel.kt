package com.initishbhatt.marvelsuperheros.characters.item

import android.databinding.BaseObservable
import android.databinding.ObservableField
import com.initishbhatt.marvelsuperheros.characters.model.MarvelSuperHeroes

/**
 * @author nitishbhatt
 */
class CharacterViewModel(var superHero: MarvelSuperHeroes) : BaseObservable() {

    val id: ObservableField<String> = ObservableField(superHero.id.toString())
    val name: ObservableField<String> = ObservableField(superHero.name)
    val description: ObservableField<String> = ObservableField(superHero.description)
    val imageUrl: ObservableField<String> = ObservableField(superHero.imageUrl)
}