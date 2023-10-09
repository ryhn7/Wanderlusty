package com.example.wanderlusty.feature_explore_tourism.data.datasource

import com.example.wanderlusty.feature_explore_tourism.data.model.Tourism
import com.example.wanderlusty.feature_explore_tourism.data.model.dummyFavoritePlace
import com.example.wanderlusty.feature_explore_tourism.data.model.dummyHiddenGems

interface LocalDataSource {
    fun getAllFavoritePlaces(): List<Tourism>?
    fun getAllHiddenGems(): List<Tourism>?
}

object TourismDataSource: LocalDataSource {
    override fun getAllFavoritePlaces(): List<Tourism> {
        return dummyFavoritePlace
    }
    override fun getAllHiddenGems(): List<Tourism> {
        return dummyHiddenGems
    }
}
