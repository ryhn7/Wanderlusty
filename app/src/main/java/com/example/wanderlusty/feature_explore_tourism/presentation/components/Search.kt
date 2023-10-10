package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.theme.DavysGrey
import com.example.wanderlusty.core.theme.LightSilver
import com.example.wanderlusty.core.theme.MughalGreen
import com.example.wanderlusty.core.theme.WanderlustyTheme
import com.example.wanderlusty.core.theme.White


@Composable
fun Search(modifier: Modifier) {

    var query by rememberSaveable { mutableStateOf("") }

    val customTextSelectionColors = TextSelectionColors(
        handleColor = MughalGreen,
        backgroundColor = MughalGreen.copy(alpha = 0.25f)
    )

    Box(
        modifier = modifier
            .border(
                width = 1.5.dp,
                color = LightSilver,
                shape = CircleShape
            )

    ) {
        CompositionLocalProvider(LocalTextSelectionColors provides customTextSelectionColors) {
            TextField(
                value = query,
                singleLine = true,
                onValueChange = { query = it },
                placeholder = {
                    Text(
                        text = "Where to?",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Thin,
                            color = DavysGrey.copy(alpha = 0.7f),
                        ),
                        modifier = Modifier.padding(top = 4.dp)
                    )
                },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_search_light_black),
                        contentDescription = R.string.icon.toString(),
                        modifier = Modifier
                            .size(30.dp)
                            .padding(top = 2.dp)
                            .offset(x = 8.dp, y = (-1).dp)
                    )
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = White,
                    unfocusedContainerColor = White,
                    cursorColor = MughalGreen,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                textStyle = TextStyle.Default.copy(
                    fontSize = 18.sp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(CircleShape)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SearchPreview() {
    WanderlustyTheme {
        Search(modifier = Modifier)
    }
}