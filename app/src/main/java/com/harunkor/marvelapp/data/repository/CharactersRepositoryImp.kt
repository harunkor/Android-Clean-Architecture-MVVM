package com.harunkor.marvelapp.data.repository

import com.harunkor.marvelapp.data.source.remote.RetrofitService
import com.harunkor.marvelapp.domain.model.Character
import com.harunkor.marvelapp.domain.repository.CharactersRepository
import io.reactivex.rxjava3.core.Single

class CharactersRepositoryImp(
    private val retrofitService: RetrofitService
): CharactersRepository {

    override fun getCharacters(limit: Int?, offset: Int?): Single<Character> {
        return retrofitService.getCharacters(limit!!, offset!!)
    }
}