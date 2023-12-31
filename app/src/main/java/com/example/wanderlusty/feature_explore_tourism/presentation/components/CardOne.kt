package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.theme.DavysGrey

@Composable
fun CardOne(
    image: Int,
    title: String,
    rating: Number,
    review: Number,
    type: String,
    location: String,
    price: String? = null,
    modifier: Modifier,
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
        modifier = modifier.width(228.dp),
        shape = RoundedCornerShape(0.dp),
    ) {
        Box {
            Image(
                painter = painterResource(id = image),
                contentDescription = R.string.dummy_image.toString(),
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .height(228.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Bookmark(
                onClick = {},
                modifier = Modifier
                    .padding(top = 7.dp, end = 7.dp)
                    .align(Alignment.TopEnd)
            )

        }
        Column {
            Text(
                text = title,
                style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    letterSpacing = (-0.56).sp,
                    platformStyle = PlatformTextStyle(
                        includeFontPadding = false
                    ),
                ),
                modifier = Modifier
                    .padding(start = 1.dp, top = 6.dp, bottom = 2.dp)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
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
                        fontWeight = FontWeight.SemiBold
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
                text = type,
                style = MaterialTheme.typography.labelLarge.copy(
                    fontWeight = FontWeight.Normal,
                ),
                modifier = Modifier.padding(top = 2.dp)
            )
            Text(
                text = location,
                style = MaterialTheme.typography.labelLarge.copy(
                    fontWeight = FontWeight.Normal,
                ),
                modifier = Modifier.padding(top = 1.5.dp)
            )
            Text(
                text = price ?: "",
                style = MaterialTheme.typography.labelLarge.copy(
                    fontWeight = FontWeight.Medium,
                ),
            )
        }
    }
}

//@Composable
//@Preview(showBackground = false)
//fun CardOnePreview() {
//    WanderlustyTheme {
//        CardOne(
//            content = Tourism(
//                1,
//                R.drawable.example_img,
//                "Monte Cervino",
//                4.8,
//                1000,
//                "Mountain",
//                "Breuil-Cervinia, Italy",
//                "from \$39.82 per adult (price varies by group size)"
//            ),
//            modifier = Modifier
//        )
//    }
//}
