package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import com.example.wanderlusty.core.theme.DavysGrey
import com.example.wanderlusty.core.theme.Maize
import com.example.wanderlusty.core.theme.WanderlustyTheme

@Composable
fun CardThree(
    image: Painter,
    name: String,
    rating: Double,
    review: Int,
    price: Int,
    site: String,
    sponsored: Boolean?,
    modifier: Modifier
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
        modifier = modifier
            .width(312.dp),
        shape = RoundedCornerShape(0.dp),
    ) {
        Box {
            Image(
                painter = image,
                contentDescription = R.string.dummy_image.toString(),
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .height(181.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Bookmark(
                onClick = {},
                modifier = Modifier
                    .padding(top = 7.dp, end = 7.dp)
                    .align(Alignment.TopEnd)
            )
        }
        if (sponsored == true) {
            Sponsored()
        }
        Text(
            text = name,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.SemiBold,
            )
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 1.dp, start = 1.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_start_fill),
                contentDescription = R.string.icon.toString(),
                modifier = Modifier
                    .padding(bottom = 2.dp)
                    .size(14.dp)
                    .offset(x = (-2).dp)
            )
            Text(
                text = rating.toString(),
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier.padding(end = 2.dp)
            )
            Text(
                text = "(${review})",
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Normal,
                    color = DavysGrey
                ),
            )
        }
        Text(
            text = "Rp. ${price},-",
            style = MaterialTheme.typography.labelMedium.copy(
                fontWeight = FontWeight.SemiBold,
            ),
            modifier = Modifier.padding(top = 2.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 3.dp)
        ) {
            Text(
                text = "Official Site",
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Normal,
                )
            )

            Image(
                painter = painterResource(id = R.drawable.ic_link),
                contentDescription = R.string.icon.toString(),
                modifier = Modifier
                    .padding(bottom = 2.dp)
                    .size(12.dp)
                    .offset(x = 1.dp, y = (-4).dp)
            )
        }

        ContactButton(
            Modifier = Modifier
                .align(Alignment.End)
                .offset(y = (-44).dp)
        )
    }
}

@Composable
fun ContactButton(
    Modifier: Modifier
) {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Maize,
        ),
        modifier = Modifier
            .width(95.dp)
            .height(36.dp),
    ) {
        Text(
            text = "Contact",
            style = MaterialTheme.typography.labelSmall.copy(
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
            )
        )
    }
}

@Composable
@Preview(showBackground = true)
fun CardThreePreview() {
    WanderlustyTheme {
        CardThree(
            image = painterResource(id = R.drawable.example_img),
            name = "HARRIS Hotel Semarang",
            rating = 4.3,
            review = 120,
            price = 484200,
            site = "https://www.bali.com/",
            sponsored = true,
            modifier = Modifier
        )
    }
}