package com.example.wanderlusty.feature_explore_tourism.presentation.explore

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asFlow
import androidx.lifecycle.viewModelScope
import com.example.wanderlusty.core.common.ResultState
import com.example.wanderlusty.feature_explore_tourism.data.model.Tourism
import com.example.wanderlusty.feature_explore_tourism.domain.use_case.UseCasesTourism
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExploreViewModel @Inject constructor(
    private val useCases: UseCasesTourism
) : ViewModel() {
    private val _tourismState: MutableStateFlow<ResultState<List<Tourism>>> =
        MutableStateFlow(ResultState.Loading)
    val tourismState: StateFlow<ResultState<List<Tourism>>> = _tourismState

    fun getAllHiddenGems() {
        viewModelScope.launch {
            useCases.getHiddenGems().asFlow().collect {
                when(it) {
                    is ResultState.Loading -> {
                        _tourismState.value = ResultState.Loading
                    }
                    is ResultState.Success -> {
                        _tourismState.value = ResultState.Success(it.data)
                    }
                    is ResultState.Error -> {
                        _tourismState.value = ResultState.Error(it.error ?: "An error occurred")
                    }
                }
            }
        }
    }
}