package com.initishbhatt.marvelsuperheros.api

import com.initishbhatt.marvelsuperheros.api.model.AllCharactersModel
import com.initishbhatt.marvelsuperheros.api.model.Comic
import com.initishbhatt.marvelsuperheros.api.model.DataWrapper
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * @author nitishbhatt
 */
const val HASH = "hash"
const val TIMESTAMP = "ts"
const val OFFSET = "offset"
const val LIMIT = "limit"
const val CHARACTER_ID = "characterId"

interface MarvelService {

    @GET("characters")
    fun getCharacters(@Query(HASH) md5Digest: String,
                      @Query(TIMESTAMP) timestamp: Long,
                      @Query(OFFSET) offset: Int?,
                      @Query(LIMIT) limit: Int?): Single<DataWrapper<List<AllCharactersModel>>>

    @GET("characters/{characterId}")
    fun getCharacter(@Path(CHARACTER_ID) characterId: Long,
                     @Query(HASH) md5Digest: String,
                     @Query(TIMESTAMP) timestamp: Long): Single<DataWrapper<List<AllCharactersModel>>>

    @GET("characters/{characterId}/{comicType}")
    fun getCharacterComics(@Path(CHARACTER_ID) characterId: Long,
                           @Path("comicType") comicType: String,
                           @Query("offset") offset: Int?,
                           @Query(LIMIT) limit: Int?,
                           @Query(HASH) md5Digest: String,
                           @Query(TIMESTAMP) timestamp: Long): Single<DataWrapper<List<Comic>>>


}