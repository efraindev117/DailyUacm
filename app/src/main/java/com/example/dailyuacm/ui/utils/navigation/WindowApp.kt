package com.example.dailyuacm.ui.utils.navigation

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.dailyuacm.ui.features.UiMode
import com.example.dailyuacm.ui.navigation.component.NestedNavigation
import com.example.dailyuacm.ui.utils.navigation.NavigationType

@Composable
fun WindowApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {
    val navigationType: NavigationType
    when (windowSize) {
        WindowWidthSizeClass.Compact -> {
            navigationType = NavigationType.NAVIGATION_DRAWER
        }

        WindowWidthSizeClass.Expanded -> {
            navigationType = NavigationType.NAVIGATION_DRAWER
        }

        WindowWidthSizeClass.Medium -> {
            navigationType = NavigationType.NAVIGATION_DRAWER
        }
        else ->{

        }
    }
    //
    NestedNavigation()
}