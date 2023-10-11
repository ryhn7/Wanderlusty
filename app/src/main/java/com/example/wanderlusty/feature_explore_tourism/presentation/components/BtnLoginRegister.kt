package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BtnLoginRegister(
    label: String,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = {Unit},
        colors = ButtonDefaults.buttonColors(
            containerColor = if (label == "Sign in") Color.Black else Color.White,
            contentColor = if (label == "Sign in") Color.White else Color.Black
        ),
        border = BorderStroke(3.dp, Color.Black),
        shape = MaterialTheme.shapes.extraLarge,
        modifier = androidx.compose.ui.Modifier
            .padding(top = 16.dp)
            .height(60.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.SemiBold
            )
        )
    }
}

@Composable
@Preview(showBackground = true)
fun BtnLoginRegisterPreview() {
    MaterialTheme {
        Column {
            BtnLoginRegister(
                label = "Sign in",
                modifier = Modifier,
                onClick = {}
            )

            BtnLoginRegister(
                label = "Sign up",
                modifier = Modifier,
                onClick = {}
            )
        }
    }
}