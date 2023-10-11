package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wanderlusty.core.theme.CalPolyPomonaGreen
import com.example.wanderlusty.core.theme.WanderlustyTheme
import com.example.wanderlusty.core.theme.White

@Composable
fun AddTourismCard(
    title: String,
    cta: String,
    icon: Int,
    modifier: Modifier
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = CalPolyPomonaGreen,
        ),
        modifier = modifier.height(200.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Text(
            text = "Help expand our\n map of wonders!",
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = White
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 32.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun AddTourismCardPreview()
{
    WanderlustyTheme {
        AddTourismCard(
            title = "Tambahkan Tempat Wisata",
            cta = "Tambahkan",
            icon = 0,
            modifier = Modifier
        )
    }
}
