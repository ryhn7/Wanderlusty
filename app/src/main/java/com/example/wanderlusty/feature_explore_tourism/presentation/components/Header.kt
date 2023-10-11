package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun Header(
    modifier: Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxWidth()
    ) {
        Column {
            Row {
                Text(
                    text = "Hi, ",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Thin,
                        fontSize = 18.sp,
                        color = DavysGrey,
                        platformStyle = PlatformTextStyle(
                            includeFontPadding = false
                        ),
                    )
                )
                Text(
                    text = "Traveler!",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        color = DavysGrey,
                        platformStyle = PlatformTextStyle(
                            includeFontPadding = false
                        ),
                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_location),
                    contentDescription = R.string.icon.toString(),
                    modifier = Modifier
                        .size(30.dp)
                        .offset(x = (-5).dp)
                )
                Text(
                    text = "Pontianak",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                    ),
                    modifier = Modifier
                        .offset(x = (-3).dp, y = 1.dp)
                )
            }
        }
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = R.string.icon.toString(),
            modifier = Modifier
                .size(50.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun HeaderPreview() {
    WanderlustyTheme {
        Header(modifier = Modifier)
    }
}