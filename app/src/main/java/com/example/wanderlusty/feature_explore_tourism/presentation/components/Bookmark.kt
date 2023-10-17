package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.theme.WanderlustyTheme
import com.example.wanderlusty.core.theme.White

@Composable
fun Bookmark(
    modifier: Modifier,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = White),
        shape = CircleShape,
        contentPadding = PaddingValues(0.dp),
        modifier = modifier
            .size(45.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_bookmark),
                contentDescription = R.string.icon.toString(),
                modifier = Modifier.size(26.dp)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun BookmarkPreview() {
    WanderlustyTheme {
        Bookmark(
            modifier = Modifier,
            onClick = {}
        )
    }
}