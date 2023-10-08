package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.theme.DavysGrey
import com.example.wanderlusty.core.theme.LightSilver
import com.example.wanderlusty.core.theme.WanderlustyTheme
import com.example.wanderlusty.core.theme.White


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(modifier: Modifier) {
    SearchBar(query = "", onQueryChange = {}, onSearch = {}, active = false, onActiveChange = {},
        leadingIcon = {
            Image(
                painter = painterResource(id = R.drawable.ic_search_light),
                contentDescription = R.string.icon.toString(),
                modifier = Modifier
                    .size(26.dp)
                    .offset(x = (-4).dp, y = (-4).dp)
            )
        },
        placeholder = {
            Text(
                text = "Where to?",
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Thin,
                    color = DavysGrey.copy(alpha = 0.7f),
                ),
                modifier = Modifier.offset(x = (-9).dp, y = (-6).dp)
            )

        },
        shape = MaterialTheme.shapes.large,
        colors = SearchBarDefaults.colors(
            containerColor = White
        ),
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp)
            .border(
                width = 1.5.dp,
                color = LightSilver,
                shape = RoundedCornerShape(26.dp)
            )


    ) {

    }

}


@Preview(showBackground = true)
@Composable
fun SearchPreview() {
    WanderlustyTheme {
        Search(modifier = Modifier)
    }
}