package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.theme.WanderlustyTheme

@Composable
fun CardTwo(
    image: Painter,
    name: String,
    modifier: Modifier
) {
    Card (
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
        modifier = modifier.width(206.dp),
        shape = RoundedCornerShape(0.dp),
    ) {
        Box {
            Image(
                painter = image,
                contentDescription = R.string.dummy_image.toString(),
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .height(206.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Text(
                text = name,
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                ),
                modifier = Modifier.offset(7.dp, 168.dp)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CardTwoPreview() {
    WanderlustyTheme {
        CardTwo(
            image = painterResource(id = R.drawable.example_img),
            name = "Semarang",
            modifier = Modifier
        )
    }
}