package com.example.wanderlusty.feature_explore_tourism.presentation.components

import android.R
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wanderlusty.core.theme.WanderlustyTheme

@Composable
fun Sponsored() {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE5E5E5),
        ),
        shape = RoundedCornerShape(6.dp),
        modifier = Modifier
            .padding(top = 8.dp, bottom = 6.dp)
    ) {
        Box(
            modifier = Modifier
            .size(83.dp, 20.dp),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = "Sponsored",
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF505055),
                ),
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SponsoredPreview() {
    WanderlustyTheme {
        Sponsored()
    }
}