package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.wanderlusty.feature_explore_tourism.data.model.dummyCategory

@Composable
fun ListCategory(
    modifier: Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(32.dp),
        modifier = modifier
    ) {
        items(dummyCategory.size) {
            CardCategory(
                category = dummyCategory[it],
                modifier = Modifier
            )
        }
    }
}