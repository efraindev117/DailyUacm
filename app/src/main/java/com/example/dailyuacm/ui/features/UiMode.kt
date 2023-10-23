package com.example.dailyuacm.ui.features

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.dailyuacm.ui.utils.navigation.NavigationType


@Composable
fun UiMode(
    modifier: Modifier = Modifier,
    navigationType: NavigationType
) {
    if (navigationType == NavigationType.NAVIGATION_DRAWER) {
        AnimatedVisibility(
            visible = navigationType == NavigationType.NAVIGATION_DRAWER
        ){
            //
        }
    }
}