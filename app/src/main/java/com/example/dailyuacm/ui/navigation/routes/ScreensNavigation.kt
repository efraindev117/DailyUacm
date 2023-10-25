package com.example.dailyuacm.ui.navigation.routes

import com.example.dailyuacm.ui.navigation.routes.RoutesLoginAndRegister.USER_LOGIN
import com.example.dailyuacm.ui.navigation.routes.RoutesLoginAndRegister.USER_REGISTER
import com.example.dailyuacm.ui.navigation.routes.RoutesLoginAndRegister.USER_SIGNUP
import com.example.dailyuacm.ui.navigation.routes.RoutesNavigationDrawer.AGENDA_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.routes.RoutesNavigationDrawer.CALENDAR_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.routes.RoutesNavigationDrawer.CURSES_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.routes.RoutesNavigationDrawer.HELP_AND_QUESTION_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.routes.RoutesNavigationDrawer.HOME_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.routes.RoutesNavigationDrawer.PROFESSION_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.routes.RoutesNavigationDrawer.RATING_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.routes.RoutesNavigationDrawer.SETTINGS_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.routes.RoutesNavigationDrawer.TEACHER_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.routes.RoutesNavigationDrawer.TERMS_AND_CONDITIONS_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.routes.RoutesNavigationDrawer.USER_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.routes.SplashScreen.SPLASH_SCREEN


sealed class ScreensNavigation(val route: String) {
    object SplashScreen : ScreensNavigation(SPLASH_SCREEN)
    object RegisterAndLogin : ScreensNavigation(USER_REGISTER) {
        object Login : ScreensNavigation(USER_LOGIN)
        object SignUp : ScreensNavigation(USER_SIGNUP)
    }

    object HomeScreen : ScreensNavigation(HOME_NAVIGATION_ROUTE_NAME)
    object AgendaScreen : ScreensNavigation(AGENDA_NAVIGATION_ROUTE_NAME)
    object CalendarScreen : ScreensNavigation(CALENDAR_NAVIGATION_ROUTE_NAME)
    object UserScreen : ScreensNavigation(USER_NAVIGATION_ROUTE_NAME)
    object TeachersScreen : ScreensNavigation(TEACHER_NAVIGATION_ROUTE_NAME)
    object RatingScreen : ScreensNavigation(RATING_NAVIGATION_ROUTE_NAME)
    object SettingsScreen : ScreensNavigation(SETTINGS_NAVIGATION_ROUTE_NAME)
    object CursesScreen : ScreensNavigation(CURSES_NAVIGATION_ROUTE_NAME)
    object ProfessionScreen : ScreensNavigation(PROFESSION_NAVIGATION_ROUTE_NAME)
    object TermsAndConditionScreen : ScreensNavigation(TERMS_AND_CONDITIONS_NAVIGATION_ROUTE_NAME)
    object HelpAndQuestionScreen : ScreensNavigation(HELP_AND_QUESTION_NAVIGATION_ROUTE_NAME)
}
