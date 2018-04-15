package com.initishbhatt.marvelsuperheros.api.model

/**
 * @author nitishbhatt
 */
data class Comic(
        val id: Int,
        val title: String,
        val description: Any,
        val startYear: Int,
        val endYear: Int,
        val rating: String,
        val modified: String,
        val name: String,
        val resourceURI: String,
        val thumbnail: Image,
        val images: List<Image>
)

data class DataContainer<out T>(
        val offset: Int,
        val limit: Int,
        val total: Int,
        val count: Int,
        val results: T
)

data class CharacterComicWrapper(
        val available: Int,
        val collectionURI: String,
        val returned: Int,
        val items: List<Comic>? = listOf()
)

data class DataWrapper<out T>(
        val code: Int,
        val status: String,
        val copyRight: String,
        val attributionText: String,
        val attributionHTML: String,
        val etag: String,
        val data: DataContainer<T>
)

data class Image(
        val path: String,
        val extension: String
)

data class AllCharactersModel(
        val id: Long,
        val name: String,
        val description: String,
        val thumbnail: Image,
        val comics: CharacterComicWrapper,
        val series: CharacterComicWrapper,
        val stories: CharacterComicWrapper,
        val events: CharacterComicWrapper,
        val urls: List<Url>
)

data class Url(
        val type: String,
        val url: String
)