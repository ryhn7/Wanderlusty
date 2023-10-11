package com.example.wanderlusty.feature_explore_tourism.presentation.explore

import com.example.wanderlusty.feature_explore_tourism.data.model.Tourism

data class ExploreState(
    val isLoading: Boolean = true,
    val error: String? = null,
    val hiddenGems: List<Tourism>? = null,
    val favoritePlace: List<Tourism>? = null,
)
