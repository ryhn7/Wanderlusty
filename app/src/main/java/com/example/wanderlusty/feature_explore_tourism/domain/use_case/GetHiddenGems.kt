package com.example.wanderlusty.feature_explore_tourism.domain.use_case

import androidx.lifecycle.LiveData
import com.example.wanderlusty.core.common.ResultState
import com.example.wanderlusty.feature_explore_tourism.data.model.Tourism
import com.example.wanderlusty.feature_explore_tourism.domain.repository.TourismRepository

class GetHiddenGems(private val repository: TourismRepository) {
    suspend operator fun invoke(): LiveData<ResultState<List<Tourism>>> {
        return repository.getAllHiddenGems()
    }
}