package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.theme.DavysGrey
import com.example.wanderlusty.core.theme.IguanaGreen
import com.example.wanderlusty.core.theme.WanderlustyTheme
import com.example.wanderlusty.feature_explore_tourism.data.model.Category

@Composable
fun CardCategory(
    category: Category,
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
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(45.dp)
                    .background(color = IguanaGreen.copy(alpha = 0.25f), shape = CircleShape)
            ) {
                Image(
                    painter = painterResource(id = category.imageCategory),
                    contentDescription = R.string.icon.toString(),
                    modifier = Modifier.size(26.dp)
                )
            }
            Text(
                text = stringResource(category.textCategory),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodySmall.copy(
                    fontWeight = FontWeight.Thin,
                    color = DavysGrey
                ),
                modifier = Modifier
                    .padding(top = 8.dp)
//                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CardCategoryPreview() {
    WanderlustyTheme {
        CardCategory(
            category = Category(
                R.drawable.ic_forest,
                R.string.forest,
            ),
            modifier = Modifier
        )
    }
}
