package com.harunkor.marvelapp.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harunkor.marvelapp.domain.model.Character
import com.harunkor.marvelapp.domain.usecase.CharactersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val charactersUseCase: CharactersUseCase
): ViewModel() {

    val charactersData = MutableLiveData<Character>()

    fun getCharacters(limit: Int,offset: Int){
        charactersUseCase.setLimit(limit)
        charactersUseCase.setOffset(offset)
        charactersUseCase.execute(
            onSuccess = {
                charactersData.value = it
            },
            onError = {
                Log.v("ERROR",it.message.toString())
            }
        )
    }

}