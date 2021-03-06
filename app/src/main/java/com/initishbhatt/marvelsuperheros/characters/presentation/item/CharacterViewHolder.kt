package com.initishbhatt.marvelsuperheros.characters.presentation.item

import android.support.v7.widget.RecyclerView
import com.initishbhatt.marvelsuperheros.characters.model.MarvelSuperHeroes
import com.initishbhatt.marvelsuperheros.databinding.ItemHerosBinding

/**
 * @author nitishbhatt
 */
class CharacterViewHolder(private val binding: ItemHerosBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(superHero: MarvelSuperHeroes) {
        if (binding.viewModel == null)
            binding.viewModel = CharacterViewModel(itemView.context, superHero)
        else
            binding.viewModel!!.superHero = superHero
    }
}