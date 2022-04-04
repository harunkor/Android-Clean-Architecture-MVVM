package com.harunkor.marvelapp.data.repository

import com.harunkor.marvelapp.data.source.remote.RetrofitService
import com.harunkor.marvelapp.domain.model.Comics
import com.harunkor.marvelapp.domain.repository.CharactersDetailRepository
import io.reactivex.rxjava3.core.Single


class CharactersDetailRepositoryImp(
    private val retrofitService: RetrofitService
):CharactersDetailRepository {
    override fun getComics(characterId: Int?, dateRange: String?): Single<Comics> {
        return retrofitService.getCharacterDetail(characterId!!,dateRange!!)
    }
}