package com.example.wanderlusty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.wanderlusty.core.theme.WanderlustyTheme
import com.example.wanderlusty.feature_explore_tourism.presentation.auth.LoginPage
import com.example.wanderlusty.feature_explore_tourism.presentation.explore.ExploreScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WanderlustyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ExploreScreen()
//                    LoginPage(modifier = Modifier)
                }
            }
        }
    }
}

