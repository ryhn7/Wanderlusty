package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
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
        itemsIndexed(dummyCategory) { index, _ ->
            val endPadding = if (index == dummyCategory.size - 1) 16.dp else 0.dp
            CardCategory(
                category = dummyCategory[index],
                modifier = Modifier.padding(end = endPadding)
            )
        }
    }
}