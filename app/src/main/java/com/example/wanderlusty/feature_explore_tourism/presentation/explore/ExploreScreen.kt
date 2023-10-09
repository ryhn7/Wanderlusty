package com.example.wanderlusty.feature_explore_tourism.presentation.explore

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wanderlusty.core.theme.DavysGrey
import com.example.wanderlusty.core.theme.WanderlustyTheme
import com.example.wanderlusty.core.theme.White
import com.example.wanderlusty.feature_explore_tourism.presentation.components.Header
import com.example.wanderlusty.feature_explore_tourism.presentation.components.ListCategory
import com.example.wanderlusty.feature_explore_tourism.presentation.components.Search

@Composable
fun ExploreScreenContent(
    modifier: Modifier
) {
    LazyColumn(
        modifier = modifier
            .background(White)
            .fillMaxWidth()
            .padding(start = 24.dp, top = 30.dp, end = 24.dp)
    ) {
        item {
            Header(modifier = Modifier)
        }
        item {
            Search(modifier = Modifier.padding(top = 36 .dp))
        }
        item {
            Text(
                text = "Explore",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(top = 30.dp)
            )
        }
        item {
            ListCategory(modifier = Modifier.padding(top = 12 .dp))
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ExploreScreenContentPreview() {
    WanderlustyTheme {
        ExploreScreenContent(modifier = Modifier)
    }
}