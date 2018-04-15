package com.initishbhatt.marvelsuperheros.interactor

import com.initishbhatt.marvelsuperheros.BuildConfig
import com.initishbhatt.marvelsuperheros.api.MarvelService
import com.initishbhatt.marvelsuperheros.api.model.AllCharactersModel
import com.initishbhatt.marvelsuperheros.api.model.DataWrapper
import com.initishbhatt.marvelsuperheros.characters.model.CharacterMapper
import com.initishbhatt.marvelsuperheros.characters.model.MarvelSuperHeroes
import com.initishbhatt.marvelsuperheros.util.HashGenerator
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author nitishbhatt
 */
interface MarvelInteractor {
    fun getAllSuperHeroes(): Single<List<MarvelSuperHeroes>>
}

@Singleton
class MarvelInteractorImpl @Inject constructor(private val marvelService: MarvelService,
                                               private val characterMapper: CharacterMapper,
                                               private val hashGenerator: HashGenerator) : MarvelInteractor {
    override fun getAllSuperHeroes(): Single<List<MarvelSuperHeroes>> {
        val timeStamp = System.currentTimeMillis()
        return getMarvelCharacters(timeStamp)
                .map { dataWrapper: DataWrapper<List<AllCharactersModel>> ->
                    val characters = ArrayList<MarvelSuperHeroes>()
                    dataWrapper.data.results
                            .forEach({
                                val characterMarvel = characterMapper.map(it)
                                characters.add(characterMarvel)
                            })
                    characters
                }

    }

    private fun getMarvelCharacters(timeStamp: Long): Single<DataWrapper<List<AllCharactersModel>>> {
        return marvelService.getCharacters(hashGenerator.buildMD5Digest("" + timeStamp +
                BuildConfig.PRIVATE_KEY + BuildConfig.PUBLIC_KEY),
                timeStamp, 0, 10)
    }
}