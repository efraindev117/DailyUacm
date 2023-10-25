package com.example.dailyuacm.ui.features.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.dailyuacm.ui.navigation.routes.ScreensNavigation

@Composable
fun SplashScreen(text: String, navHostController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(onClick = { navHostController.navigate(ScreensNavigation.RegisterAndLogin.route) }) {
            Text(text = "go to register screen")
        }
    }
}