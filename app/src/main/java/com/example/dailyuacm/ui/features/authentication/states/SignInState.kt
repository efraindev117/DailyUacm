package com.example.dailyuacm.ui.features.authentication.states

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)