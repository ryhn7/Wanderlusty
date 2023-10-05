package com.example.wanderlusty.core.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.wanderlusty.R

val Poppins = FontFamily(
    Font(R.font.poppins_light, FontWeight.Light),
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
    Font(R.font.poppins_bold, FontWeight.Bold),
)

val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = Poppins,
        fontSize = 32.sp,

        ),
    headlineMedium = TextStyle(
        fontFamily = Poppins,
        fontSize = 28.sp,

        ),
    headlineSmall = TextStyle(
        fontFamily = Poppins,
        fontSize = 24.sp,

        ),
    titleLarge = TextStyle(
        fontFamily = Poppins,
        fontSize = 22.sp,

        ),
    titleMedium = TextStyle(
        fontFamily = Poppins,
        fontSize = 16.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = Poppins,
        fontSize = 14.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = Poppins,
        fontSize = 16.sp,

        ),
    bodyMedium = TextStyle(
        fontFamily = Poppins,
        fontSize = 14.sp,

        ),
    bodySmall = TextStyle(
        fontFamily = Poppins,
        fontSize = 12.sp,

        ),
    labelLarge = TextStyle(
        fontFamily = Poppins,
        fontSize = 14.sp,

        ),
    labelMedium = TextStyle(
        fontFamily = Poppins,
        fontSize = 12.sp,

        ),
    labelSmall = TextStyle(
        fontFamily = Poppins,
        fontSize = 10.sp,

        )
)