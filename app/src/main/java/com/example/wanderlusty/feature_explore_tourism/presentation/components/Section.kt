package com.example.wanderlusty.feature_explore_tourism.presentation.components


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.wanderlusty.core.theme.WanderlustyTheme

@Composable
fun Section(
    title: String,
    subtitle: String? = null,
    modifier: Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = FontWeight.Medium,
                fontSize = 22.sp
            )
        )
        Text(
            text = subtitle ?: "",
            style = MaterialTheme.typography.titleSmall.copy(
                fontWeight = FontWeight.Thin,
                fontSize = 15.sp,
                letterSpacing = (-0.14).sp,
            )
        )
    }
}

@Composable
@Preview(showBackground = true)
fun SectionPreview() {
    WanderlustyTheme {
        Section(
            title = "Hidden gems",
            subtitle = "Explore nearby gems and hidden treasures",
            modifier = Modifier
        )
    }
}