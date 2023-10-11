package com.example.wanderlusty.feature_explore_tourism.presentation.explore

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asFlow
import androidx.lifecycle.viewModelScope
import com.example.wanderlusty.core.common.ResultState
import com.example.wanderlusty.feature_explore_tourism.domain.use_case.UseCasesTourism
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExploreViewModel @Inject constructor(
    private val useCases: UseCasesTourism
) : ViewModel() {

    var state by mutableStateOf(ExploreState())
        private set

    init {
        getAllHiddenGems()
    }

    fun getAllHiddenGems() {
        viewModelScope.launch {
            useCases.getHiddenGems().asFlow().collect {
                when(it) {
                    is ResultState.Loading -> {
                        state = state.copy(
                            error = null
                        )
                    }
                    is ResultState.Success -> {
                        state = state.copy(
                            isLoading = false,
                            error = null,
                            hiddenGems = it.data
                        )

                        getAllFavoritePlace()
                    }
                    is ResultState.Error -> {
                        state = state.copy(
                            isLoading = false,
                            error = it.error ?: "An error occurred",
                        )
                    }
                }
            }
        }
    }

    fun getAllFavoritePlace() {
        viewModelScope.launch {
            useCases.getAllFavoritePlace().asFlow().collect {
                when(it) {
                    is ResultState.Loading -> {
                        state = state.copy(
                            error = null
                        )
                    }
                    is ResultState.Success -> {
                        state = state.copy(
                            isLoading = false,
                            error = null,
                            favoritePlace = it.data
                        )
                    }
                    is ResultState.Error -> {
                        state = state.copy(
                            isLoading = false,
                            error = it.error ?: "An error occurred",
                        )
                    }
                }
            }
        }
    }
}