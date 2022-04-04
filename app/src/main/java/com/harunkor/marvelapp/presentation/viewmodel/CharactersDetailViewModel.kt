package com.harunkor.marvelapp.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harunkor.marvelapp.domain.model.Comics
import com.harunkor.marvelapp.domain.usecase.CharactersDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class CharactersDetailViewModel @Inject constructor(
    private val charactersDetailUseCase: CharactersDetailUseCase
):ViewModel()  {

    val characterDetailData = MutableLiveData<Comics>()

    fun getcharacterDetail(characterId: Int,dateRange: String ){
        charactersDetailUseCase.setCharacterId(characterId)
        charactersDetailUseCase.setDateRange(dateRange)
        charactersDetailUseCase.execute(
            onSuccess = {
                characterDetailData.value = it
            },
            onError = {
                Log.v("ERROR",it.message.toString())
            }
        )
    }


}