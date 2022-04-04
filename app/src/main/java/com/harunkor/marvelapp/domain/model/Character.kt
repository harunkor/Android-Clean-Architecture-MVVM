package com.harunkor.marvelapp.domain.model




data class Character(
    val code: String,
    val status: String,
    val copyright: String,
    val attributionText: String,
    val attributionHTML: String,
    val data: Data,
    val etag: String
) {

}

data class Data (
    val offset: String,
    val limit: String,
    val total: String,
    val count: String,
    val results: List<Result>
)

data class Result (
    val id: String,
    val name: String,
    val description: String,
    val modified: String,
    val resourceURI: String,
    val urls: List<URL>,
    val thumbnail: Thumbnail,
    val comics: ComicsCharacter,
    val stories: Stories,
    val events: ComicsCharacter,
    val series: ComicsCharacter
)

data class ComicsCharacter (
    val available: String,
    val returned: String,
    val collectionURI: String,
    val items: List<ComicsItem>
)

data class ComicsItem (
    val resourceURI: String,
    val name: String
)

data class Stories (
    val available: String,
    val returned: String,
    val collectionURI: String,
    val items: List<StoriesItem>
)

data class StoriesItem (
    val resourceURI: String,
    val name: String,
    val type: String
)

data class Thumbnail (
    val path: String,
    val extension: String
)

data class URL (
    val type: String,
    val url: String
)
