package com.example.wanderlusty.core.presentation.componets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.theme.DavysGrey
import com.example.wanderlusty.core.theme.WanderlustyTheme

@Composable
fun CardOne(
    image: Painter,
    name: String,
    rating: Number,
    review: Number,
    type: String,
    location: String,
    price: String?,
    modifier: Modifier
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
        modifier = modifier.width(206.dp),
        shape = RoundedCornerShape(0.dp),
    ) {
        Image(
            painter = image,
            contentDescription = "dummyImg",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .height(206.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Column {
            Text(
                text = name,
                style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight.Medium,
                    letterSpacing = (-0.56).sp,
                    platformStyle = PlatformTextStyle(
                        includeFontPadding = false
                    ),
                ),
                modifier = Modifier
                    .padding(start = 1.dp, top = 4.dp, bottom = 2.dp)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_start_fill),
                    contentDescription = "Icon star fill",
                    modifier = Modifier
                        .padding(bottom = 2.dp)
                        .size(14.dp)
                        .offset(x = (-2).dp)
                )
                Text(
                    text = rating.toString(),
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier.padding(end = 2.dp)
                )
                Text(
                    text = "($review)",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Normal,
                        color = DavysGrey
                    ),
                )
            }
            Text(
                text = type,
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Normal,
                ),
                modifier = Modifier.padding(top = 2.dp)
            )
            Text(
                text = location,
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Normal,
                ),
                modifier = Modifier.padding(top = 1.5.dp)
            )
            Text(
                text = price?:"",
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Medium,
                ),
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CardOnePreview() {
    WanderlustyTheme {
        CardOne(
            image = painterResource(id = R.drawable.example_img),
            name = "Monte Cervino",
            rating = 4.7,
            review = 1000,
            type = "Mountain",
            location = "Breuil-Cervinia, Italy",
            price = "from $39.82 per adult (price varies by group size)",
            modifier = Modifier
        )
    }
}