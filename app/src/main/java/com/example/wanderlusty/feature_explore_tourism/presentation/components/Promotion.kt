package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.theme.Black
import com.example.wanderlusty.core.theme.WanderlustyTheme
import com.example.wanderlusty.core.theme.White

@Composable
fun Promotion(
    title: String,
    subtitle: String,
    buttonText: String,
    image: Int,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .height(480.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        )
        Column(
            modifier = Modifier.padding(top = 180.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 34.sp,
                    color = White
                ),
                modifier = Modifier
            )
            Text(
                text = subtitle,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    color = White
                ),
            )
            ButtonPromotion(
                text = buttonText,
                onClick = onClick,
                modifier = Modifier.padding(top = 6.dp)
            )
        }
    }
}

@Composable
fun ButtonPromotion(
    text: String,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = White
        ),
        modifier = modifier
            .height(46.dp)
            .clip(CircleShape),
        onClick = onClick
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium.copy(
                fontWeight = FontWeight.Medium,
                color = Black
            ),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPromotion() {
    WanderlustyTheme {
//        Surface(
//            color = IguanaGreen
//        ) {
//            ButtonPromotion(text = "Let's go", onClick = {}, modifier = Modifier)
//        }
        Promotion(
            title = "Coastal drives and\nforested hillsides",
            subtitle = "Immerse yourself in the beauty of nature,\nwhere the rugged shoreline meets the\nverdant wilderness",
            buttonText = "Let's go",
            image = R.drawable.coastal,
            onClick = {},
            modifier = Modifier
        )
    }
}