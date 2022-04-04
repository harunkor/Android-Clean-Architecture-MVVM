package com.harunkor.marvelapp.data.source.remote

import com.harunkor.marvelapp.domain.model.Character
import com.harunkor.marvelapp.domain.model.Comics
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RetrofitService {


    @GET("characters")
    fun getCharacters(@Query("limit") limit: Int,@Query("offset") offset: Int): Single<Character>

    @GET("characters/{characterId}/comics")
    fun getCharacterDetail(@Path("characterId") characterId: Int,@Query("dateRange") dateRange: String): Single<Comics>

}