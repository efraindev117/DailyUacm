package com.example.dailyuacm.ui.navigation.component

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.dailyuacm.ui.features.authentication.login.LoginScreen
import com.example.dailyuacm.ui.features.home.HomeScreen
import com.example.dailyuacm.ui.features.splash.SplashScreen
import com.example.dailyuacm.ui.navigation.routes.ScreensNavigation
import com.example.dailyuacm.ui.navigation.routes.SplashScreen.SPLASH_SCREEN

@Composable
fun NestedNavigation() {
    val navHostController = rememberNavController()

    NavHost(
        navController = navHostController,
        startDestination = ScreensNavigation.SplashScreen.route
    ) {
        composable(ScreensNavigation.SplashScreen.route) {
            SplashScreen("Hola Daily uacm", navHostController)
        }
        navigation(
            route = ScreensNavigation.RegisterAndLogin.route,
            startDestination = ScreensNavigation.RegisterAndLogin.Login.route
        ) {
            composable(ScreensNavigation.RegisterAndLogin.Login.route) {
                LoginScreen(text = "Login Screen")
            }
            composable(ScreensNavigation.RegisterAndLogin.SignUp.route) {
                LoginScreen(text = "Login Screen")
            }
        }
        composable(ScreensNavigation.HomeScreen.route) {
            HomeScreen(txt = "Página principal de la app")
        }
    }
}