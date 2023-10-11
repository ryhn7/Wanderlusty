package com.example.wanderlusty.feature_explore_tourism.presentation.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wanderlusty.R
import com.example.wanderlusty.core.theme.WanderlustyTheme
import com.example.wanderlusty.core.theme.White
import com.example.wanderlusty.feature_explore_tourism.presentation.components.BtnLoginRegister
import com.example.wanderlusty.feature_explore_tourism.presentation.components.ListCategory
import com.example.wanderlusty.feature_explore_tourism.presentation.components.NormalField
import com.example.wanderlusty.feature_explore_tourism.presentation.components.PasswordField
import com.example.wanderlusty.feature_explore_tourism.presentation.components.btnForgotPwd

@Composable
fun LoginPage(
    modifier: Modifier
) {
    LazyColumn(
        modifier = modifier
            .background(White)
            .fillMaxWidth()
            .padding(start = 24.dp, top = 30.dp, end = 24.dp)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.ic_back),
                contentDescription = "back",
                modifier = Modifier
                    .width(30.dp)
            )
        }
        item {
            Text(
                text = "Welcome back.",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.padding(top = 36.dp, bottom = 30.dp)
            )
        }
        item {
            NormalField(
                label = "Email address",
                plcholder = "Enter your email"
            )
        }
        item {
            PasswordField(
                label = "Password",
                plcholder = "Enter your password"
            )
        }
        item {
            btnForgotPwd()
        }
        item {
            BtnLoginRegister(
                label = "Sign in",
                onClick = {},
                modifier = Modifier
            )
        }
        item {
            BtnLoginRegister(
                label = "Sign up",
                onClick = {},
                modifier = Modifier
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LoginPagePreview() {
    WanderlustyTheme {
        LoginPage(modifier = Modifier)
    }
}