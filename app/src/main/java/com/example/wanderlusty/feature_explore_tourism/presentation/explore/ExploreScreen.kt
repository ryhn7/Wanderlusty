package com.example.wanderlusty.feature_explore_tourism.presentation.explore

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.wanderlusty.R
import com.example.wanderlusty.core.common.ResultState
import com.example.wanderlusty.core.theme.White
import com.example.wanderlusty.feature_explore_tourism.data.model.Tourism
import com.example.wanderlusty.feature_explore_tourism.presentation.components.CardOne
import com.example.wanderlusty.feature_explore_tourism.presentation.components.Header
import com.example.wanderlusty.feature_explore_tourism.presentation.components.ListCategory
import com.example.wanderlusty.feature_explore_tourism.presentation.components.Search
import com.example.wanderlusty.feature_explore_tourism.presentation.components.Section



@Composable
fun ExploreScreen(
    viewModel: ExploreViewModel = hiltViewModel()
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(White)
    ) {
        val scrollState = rememberLazyListState()

        viewModel.tourismState.collectAsState().value.let { uiState ->
            when (uiState) {
                is ResultState.Loading -> {
                    viewModel.getAllHiddenGems()
                }
                is ResultState.Success -> {
                    ExploreScreenContent(
                        listTourism = uiState.data,
                        scrollState = scrollState,
                        modifier = Modifier
                    )
                }
                is ResultState.Error -> {
                    Log.d("ExploreScreen", "Error: ${uiState.error}")
                }
            }
        }
    }
}



@Composable
fun ExploreScreenContent(
    listTourism: List<Tourism>,
    scrollState: LazyListState,
    modifier: Modifier
) {
    LazyColumn(
        modifier = modifier
            .background(White)
            .fillMaxWidth()
            .padding(start = 16.dp, top = 30.dp),
        state = scrollState
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
                modifier = Modifier.padding(top = 36.dp)
            )
        }
        item {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(14.dp),
                modifier = Modifier.padding(top = 12.dp)
            ) {
                itemsIndexed(listTourism) {index, data ->
                    val endPadding = if (index == listTourism.size - 1) 16.dp else 0.dp
                    CardOne(
                        image = data.image,
                        title = data.title,
                        rating = data.rating,
                        review = data.review,
                        type = data.type,
                        location = data.location,
                        price = data.price,
                        modifier = Modifier.padding(end = endPadding)
                    )
                }
            }
        }
    }
}

//@Composable
//@Preview(showBackground = true)
//fun ExploreScreenContentPreview() {
//    WanderlustyTheme {
//        Surface(
//            modifier = Modifier.fillMaxSize(),
//        ) {
//            ExploreScreenContent(modifier = Modifier)
//        }
//
//    }
//}