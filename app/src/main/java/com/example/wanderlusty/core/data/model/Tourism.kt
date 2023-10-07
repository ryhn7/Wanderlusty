package com.example.wanderlusty.core.data.model

import com.example.wanderlusty.R

data class Tourism(
    val image: Int,
    val title: String,
    val rating: Number,
    val review: Number,
    val type: String,
    val location: String,
    val price: String?,
)

val dummyFavoritePlace = listOf(
    Tourism(
        image = R.drawable.nusa_penida,
        title = "Kelingking Beach",
        rating = 4.8,
        review = 2000,
        type = "Beach",
        location = "Nusa Penida, Bali",
        price = null,
    ),
    Tourism(
        image = R.drawable.korod,
        title = "Korod Rice Field",
        rating = 4.5,
        review = 700,
        type = "Rice Field",
        location = "Cariu, Bogor",
        price = null,
    ),
    Tourism(
        image = R.drawable.samosir_island,
        title = "Samosir Island",
        rating = 4.7,
        review = 2300,
        type = "Island",
        location = "Lake Toba, North Sumatera",
        price = null,
    ),
)
val dummyHiddenGems = listOf(
    Tourism(
        image = R.drawable.nusa_penida,
        title = "Kelingking Beach",
        rating = 4.8,
        review = 2000,
        type = "Beach",
        location = "Nusa Penida, Bali",
        price = null,
    ),
    Tourism(
        image = R.drawable.korod,
        title = "Korod Rice Field",
        rating = 4.5,
        review = 700,
        type = "Rice Field",
        location = "Cariu, Bogor",
        price = null,
    ),
    Tourism(
        image = R.drawable.samosir_island,
        title = "Samosir Island",
        rating = 4.7,
        review = 2300,
        type = "Island",
        location = "Lake Toba, North Sumatera",
        price = null,
    ),
)