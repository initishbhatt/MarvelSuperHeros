package com.initishbhatt.marvelsuperheros.api

import com.initishbhatt.marvelsuperheros.api.model.AllCharactersModel
import com.initishbhatt.marvelsuperheros.api.model.DataWrapper
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author nitishbhatt
 */
const val HASH = "hash"
const val TIMESTAMP = "ts"
const val OFFSET = "offset"
const val LIMIT = "limit"

interface MarvelService {

    @GET("characters")
    fun getCharacters(@Query(HASH) md5Digest: String,
                      @Query(TIMESTAMP) timestamp: Long,
                      @Query(OFFSET) offset: Int?): Single<DataWrapper<List<AllCharactersModel>>>
}