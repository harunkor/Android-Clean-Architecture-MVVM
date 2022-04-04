package com.harunkor.marvelapp.domain.usecase

import com.harunkor.marvelapp.domain.model.Character
import com.harunkor.marvelapp.domain.repository.CharactersRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class CharactersUseCase @Inject constructor(
    private val charactersRepository: CharactersRepository
): Response<Character>() {

    private var limit: Int? = null
    private var offset: Int? = null

    fun setLimit(limit: Int){
        this.limit = limit
    }

    fun setOffset(offset: Int){
        this.offset = offset
    }

    override fun processResponse(): Single<Character> {
       return charactersRepository.getCharacters(limit,offset)
    }

}