package com.example.wanderlusty.feature_explore_tourism.domain.repository

import androidx.lifecycle.LiveData
import com.example.wanderlusty.core.common.ResultState
import com.example.wanderlusty.feature_explore_tourism.data.model.Tourism

interface TourismRepository {
    suspend fun getAllFavoritePlace() : LiveData<ResultState<List<Tourism>>>
    suspend fun getAllHiddenGems() : LiveData<ResultState<List<Tourism>>>
}