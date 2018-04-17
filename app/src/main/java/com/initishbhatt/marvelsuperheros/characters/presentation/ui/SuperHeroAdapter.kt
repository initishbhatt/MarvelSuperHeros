package com.initishbhatt.marvelsuperheros.characters.presentation.ui

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.initishbhatt.marvelsuperheros.R
import com.initishbhatt.marvelsuperheros.characters.presentation.item.CharacterViewHolder
import com.initishbhatt.marvelsuperheros.characters.model.MarvelSuperHeroes
import com.initishbhatt.marvelsuperheros.databinding.ItemHerosBinding

/**
 * @author nitishbhatt
 */
class SuperHeroAdapter(private var heros: List<MarvelSuperHeroes>) : RecyclerView.Adapter<CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemHerosBinding = DataBindingUtil.inflate<ItemHerosBinding>(layoutInflater, R.layout.item_heros, parent, false)
        return CharacterViewHolder(itemHerosBinding)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(heros[position])
    }

    override fun getItemCount(): Int = heros.size

    override fun getItemViewType(position: Int) = position

    fun replaceData(heros: List<MarvelSuperHeroes>) {
        this.heros = heros
    }
}