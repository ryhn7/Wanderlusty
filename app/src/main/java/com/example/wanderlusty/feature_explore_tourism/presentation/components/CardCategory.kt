package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.theme.DavysGrey
import com.example.wanderlusty.core.theme.IguanaGreen
import com.example.wanderlusty.core.theme.WanderlustyTheme

@Composable
fun CardCategory(
    image: Painter,
    name: String,
    modifier: Modifier
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
        modifier = modifier.height(71.dp),
        shape = RoundedCornerShape(0.dp),
    )
    {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(45.dp)
                .background(color = IguanaGreen.copy(alpha = 0.25f), shape = CircleShape)
        ) {
            Image(
                painter = image,
                contentDescription = R.string.ic_category.toString(),
                modifier = Modifier.size(26.dp)
            )
        }
        Text(
            text = name,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodySmall.copy(
                fontWeight = FontWeight.Thin,
                color = DavysGrey
            ),
            modifier = Modifier
                .padding(top = 8.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun CardCategoryPreview() {
    WanderlustyTheme {
        CardCategory(
            image = painterResource(id = R.drawable.ic_forest),
            name = "Forest",
            modifier = Modifier
        )
    }
}
