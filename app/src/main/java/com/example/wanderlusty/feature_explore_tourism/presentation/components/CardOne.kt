package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.data.model.Tourism
import com.example.wanderlusty.core.theme.DavysGrey
import com.example.wanderlusty.core.theme.WanderlustyTheme
import com.example.wanderlusty.core.theme.White

@Composable
fun CardOne(
    content: Tourism,
    modifier: Modifier,
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
        modifier = modifier.width(206.dp),
        shape = RoundedCornerShape(0.dp),
    ) {
        Box {
            Image(
                painter = painterResource(id = content.image),
                contentDescription = R.string.dummy_image.toString(),
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .height(206.dp)
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
                text = content.title,
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
                    contentDescription = R.string.icon.toString(),
                    modifier = Modifier
                        .padding(bottom = 2.dp)
                        .size(14.dp)
                        .offset(x = (-2).dp)
                )
                Text(
                    text = content.rating.toString(),
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier.padding(end = 2.dp)
                )
                Text(
                    text = "(${content.review})",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Normal,
                        color = DavysGrey
                    ),
                )
            }
            Text(
                text = content.type,
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Normal,
                ),
                modifier = Modifier.padding(top = 2.dp)
            )
            Text(
                text = content.location,
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Normal,
                ),
                modifier = Modifier.padding(top = 1.5.dp)
            )
            Text(
                text = content.price ?: "",
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Medium,
                ),
            )
        }
    }
}

@Composable
fun Bookmark(
    modifier: Modifier,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = White),
        shape = CircleShape,
        contentPadding = PaddingValues(0.dp),
        modifier = modifier
            .size(45.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_bookmark),
                contentDescription = R.string.icon.toString(),
                modifier = Modifier.size(26.dp)
            )
        }
    }
}

@Composable
@Preview(showBackground = false)
fun CardOnePreview() {
    WanderlustyTheme {
        CardOne(
            content = Tourism(
                R.drawable.example_img,
                "Monte Cervino",
                4.8,
                1000,
                "Mountain",
                "Breuil-Cervinia, Italy",
                "from \$39.82 per adult (price varies by group size)"
            ),
            modifier = Modifier
        )
    }
}
