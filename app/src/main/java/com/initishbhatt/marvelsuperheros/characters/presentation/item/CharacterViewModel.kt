package com.initishbhatt.marvelsuperheros.characters.presentation.item

import android.content.Context
import android.content.Intent
import android.databinding.BaseObservable
import android.databinding.ObservableField
import android.view.View
import com.initishbhatt.marvelsuperheros.characters.model.MarvelSuperHeroes
import com.initishbhatt.marvelsuperheros.detail.presentation.ui.DetailActivity

/**
 * @author nitishbhatt
 */
class CharacterViewModel(val context: Context, var superHero: MarvelSuperHeroes) : BaseObservable() {

    val id: ObservableField<String> = ObservableField(superHero.id.toString())
    val name: ObservableField<String> = ObservableField(superHero.name)
    val description: ObservableField<String> = ObservableField(superHero.description)
    val imageUrl: ObservableField<String> = ObservableField(superHero.imageUrl)

    fun onClick(view: View) {
        val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra("superHero", superHero)
        context.startActivity(intent)
    }
}