package com.example.wanderlusty.feature_explore_tourism.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.theme.WanderlustyTheme


@Composable
fun NormalField(
    label: String,
    plcholder : String
) {
    Column (
        modifier = Modifier
            .width(312.dp)
            .padding(bottom = 12.dp)
    ) {
        Text(
            text = label,
            modifier = Modifier
                .padding(bottom = 4.dp),
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
        )

        var text by remember { mutableStateOf("") }
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            placeholder = { Text(text = plcholder) },
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Composable
fun PasswordField(
    label: String,
    plcholder : String
) {
    Column (
        modifier = Modifier
            .width(312.dp)
            .padding(bottom = 12.dp)
    ) {
        Text(
            text = label,
            modifier = Modifier
                .padding(bottom = 4.dp),
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
        )

        var text by remember { mutableStateOf("") }
        var passwordVisible by remember { mutableStateOf(false) }

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            placeholder = { Text(text = plcholder) },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                val image = if (passwordVisible)
                    painterResource(id = R.drawable.ic_eye)
                else
                    painterResource(id = R.drawable.ic_eye_slash)

                val description = if (passwordVisible) "Hide password" else "Show password"

                IconButton(onClick = {passwordVisible = !passwordVisible}){
                    Icon(painter = image, description)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Composable
@Preview(showBackground = true)
fun LoginFieldPreview() {
    WanderlustyTheme {
        Column {
            NormalField(label = "Username", plcholder = "Username")
            PasswordField(label = "Password", plcholder = "Password")
        }
    }
}