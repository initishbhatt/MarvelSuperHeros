package com.initishbhatt.marvelsuperheros.characters.model

import com.initishbhatt.marvelsuperheros.api.model.AllCharactersModel
import javax.inject.Inject

/**
 * @author nitishbhatt
 */
data class MarvelSuperHeroes(
        val id: Long,
        val name: String,
        val description: String,
        val imageUrl: String
)

interface Mapper<in I, out O> {

    fun map(input: I): O
}

class CharacterMapper
@Inject constructor() : Mapper<AllCharactersModel, MarvelSuperHeroes> {

    override fun map(input: AllCharactersModel): MarvelSuperHeroes {
        return input.let {
            MarvelSuperHeroes(it.id,
                    it.name,
                    it.description,
                    "${it.thumbnail.path}.${it.thumbnail.extension}")
        }
    }

}