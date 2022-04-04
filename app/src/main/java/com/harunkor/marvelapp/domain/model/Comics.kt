package com.harunkor.marvelapp.domain.model


data class Comics (
    val code: String,
    val status: String,
    val copyright: String,
    val attributionText: String,
    val attributionHTML: String,
    val data: DataComics,
    val etag: String
) {

}

data class DataComics (
    val offset: String,
    val limit: String,
    val total: String,
    val count: String,
    val results: List<ResultComics>
)

data class ResultComics (
    val id: String,


    val digitalID: String,

    val title: String,
    val issueNumber: String,
    val variantDescription: String,
    val description: String,
    val modified: String,
    val isbn: String,
    val upc: String,
    val diamondCode: String,
    val ean: String,
    val issn: String,
    val format: String,
    val pageCount: String,
    val textObjects: List<TextObject>,
    val resourceURI: String,
    val urls: List<URLComics>,
    val series: Series,
    val variants: List<Series>,
    val collections: List<Series>,
    val collectedIssues: List<Series>,
    val dates: List<Date>,
    val prices: List<Price>,
    val thumbnail: ThumbnailComics,
    val images: List<ThumbnailComics>,
    val creators: Characters,
    val characters: Characters,
    val stories: StoriesComics,
    val events: Events
)

data class Characters (
    val available: String,
    val returned: String,
    val collectionURI: String,
    val items: List<CharactersItem>
)

data class CharactersItem (
    val resourceURI: String,
    val name: String,
    val role: String
)

data class Series (
    val resourceURI: String,
    val name: String
)

data class Date (
    val type: String,
    val date: String
)

data class Events (
    val available: String,
    val returned: String,
    val collectionURI: String,
    val items: List<Series>
)

data class ThumbnailComics (
    val path: String,
    val extension: String
)

data class Price (
    val type: String,
    val price: String
)

data class StoriesComics (
    val available: String,
    val returned: String,
    val collectionURI: String,
    val items: List<StoriesItemComics>
)

data class StoriesItemComics (
    val resourceURI: String,
    val name: String,
    val type: String
)

data class TextObject (
    val type: String,
    val language: String,
    val text: String
)

data class URLComics (
    val type: String,
    val url: String
)

