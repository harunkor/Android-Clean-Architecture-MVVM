package com.harunkor.marvelapp.domain.repository

import com.harunkor.marvelapp.domain.model.Comics
import io.reactivex.rxjava3.core.Single

interface CharactersDetailRepository {
    fun getComics(characterId: Int?,dateRange: String?): Single<Comics>
}