package com.example.wanderlusty.feature_explore_tourism.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.wanderlusty.core.common.ResultState
import com.example.wanderlusty.feature_explore_tourism.data.datasource.TourismDataSource
import com.example.wanderlusty.feature_explore_tourism.data.model.Tourism
import com.example.wanderlusty.feature_explore_tourism.domain.repository.TourismRepository

class TourismRepositoryImpl private constructor() : TourismRepository {
    override suspend fun getAllFavoritePlace(): LiveData<ResultState<List<Tourism>>> = liveData {
        try {
            val response = TourismDataSource.getAllFavoritePlaces()
            emit(ResultState.Success(response))
        } catch (e: Exception) {
            emit(ResultState.Error(e.message.toString()))
        }
    }

    override suspend fun getAllHiddenGems(): LiveData<ResultState<List<Tourism>>> = liveData {
        try {
            val response = TourismDataSource.getAllHiddenGems()
            emit(ResultState.Success(response))
        } catch (e: Exception) {
            emit(ResultState.Error(e.message.toString()))
        }
    }

    companion object {
        @Volatile
        private var instance: TourismRepositoryImpl? = null

        fun getInstance(): TourismRepositoryImpl =
            instance ?: synchronized(this) {
                instance ?: TourismRepositoryImpl()
            }
    }
}