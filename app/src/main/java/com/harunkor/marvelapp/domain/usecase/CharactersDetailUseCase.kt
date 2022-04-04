package com.harunkor.marvelapp.domain.usecase

import com.harunkor.marvelapp.domain.model.Comics
import com.harunkor.marvelapp.domain.repository.CharactersDetailRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class CharactersDetailUseCase @Inject constructor(
    private val charactersDetailRepository: CharactersDetailRepository
): Response<Comics>(){

    private var characterId: Int? = null
    private var dateRange: String? = null

    fun setCharacterId(characterId: Int){
        this.characterId = characterId
    }

    fun setDateRange(dateRange: String){
        this.dateRange = dateRange
    }

    override fun processResponse(): Single<Comics> {
        return charactersDetailRepository.getComics(characterId, dateRange)
    }
}