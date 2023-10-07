package com.example.wanderlusty.core.data.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.wanderlusty.R

data class Category(
    @DrawableRes val imageCategory: Int,
    @StringRes val textCategory: Int
)

val dummyCategory = listOf(
    R.drawable.ic_forest to R.string.forest,
    R.drawable.ic_beach to R.string.beach,
    R.drawable.ic_mountain to R.string.mountain,
    R.drawable.ic_canyon to R.string.canyon,
    R.drawable.ic_river to R.string.river,
).map { Category(it.first, it.second) }