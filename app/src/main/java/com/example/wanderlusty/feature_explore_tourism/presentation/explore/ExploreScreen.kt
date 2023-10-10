package com.example.wanderlusty.feature_explore_tourism.presentation.explore

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.theme.WanderlustyTheme
import com.example.wanderlusty.core.theme.White
import com.example.wanderlusty.feature_explore_tourism.presentation.components.Header
import com.example.wanderlusty.feature_explore_tourism.presentation.components.ListCategory
import com.example.wanderlusty.feature_explore_tourism.presentation.components.Search
import com.example.wanderlusty.feature_explore_tourism.presentation.components.Section

@Composable
fun ExploreScreenContent(
    modifier: Modifier
) {
    LazyColumn(
        modifier = modifier
            .background(White)
            .fillMaxWidth()
            .padding(start = 16.dp, top = 30.dp)
    ) {
        item {
            Header(modifier = Modifier.padding(end = 16.dp))
        }
        item {
            Search(modifier = Modifier.padding(top = 36.dp, end = 16.dp))
        }
        item {
            Text(
                text = stringResource(R.string.text_explore),
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                ),
                modifier = Modifier.padding(top = 24.dp)
            )
        }
        item {
            ListCategory(modifier = Modifier.padding(top = 6.dp))
        }
        item {
            Section(
                title = stringResource(R.string.section_hidden_gems),
                subtitle = stringResource(R.string.subtitle_hidden_gems),
                modifier = Modifier.padding(top = 36.dp, bottom = 32.dp)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ExploreScreenContentPreview() {
    WanderlustyTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            ExploreScreenContent(modifier = Modifier)
        }

    }
}