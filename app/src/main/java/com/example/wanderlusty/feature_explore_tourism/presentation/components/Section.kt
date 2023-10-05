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
    subtitle: String?,
    modifier: Modifier
) {
    Column {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = FontWeight.Medium
            )
        )
        Text(
            text = subtitle ?: "",
            style = MaterialTheme.typography.titleSmall.copy(
                fontWeight = FontWeight.Thin,
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