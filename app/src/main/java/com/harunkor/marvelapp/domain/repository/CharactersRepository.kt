package com.harunkor.marvelapp.domain.repository

import com.harunkor.marvelapp.domain.model.Character
import io.reactivex.rxjava3.core.Single

interface CharactersRepository {
    fun getCharacters(limit: Int?,offset: Int?): Single<Character>
}