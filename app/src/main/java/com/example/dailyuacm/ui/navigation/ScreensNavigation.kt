package com.example.dailyuacm.ui.navigation

import com.example.dailyuacm.ui.navigation.RoutesNavigationDrawer.AGENDA_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.RoutesNavigationDrawer.CALENDAR_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.RoutesNavigationDrawer.CURSES_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.RoutesNavigationDrawer.HELP_AND_QUESTION_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.RoutesNavigationDrawer.HOME_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.RoutesNavigationDrawer.PROFESSION_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.RoutesNavigationDrawer.RATING_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.RoutesNavigationDrawer.SETTINGS_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.RoutesNavigationDrawer.TEACHER_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.RoutesNavigationDrawer.TERMS_AND_CONDITIONS_NAVIGATION_ROUTE_NAME
import com.example.dailyuacm.ui.navigation.RoutesNavigationDrawer.USER_NAVIGATION_ROUTE_NAME

sealed class ScreensNavigation(val route: String) {
    object HomeScreen : ScreensNavigation(HOME_NAVIGATION_ROUTE_NAME)
    object AgendaScreen : ScreensNavigation(AGENDA_NAVIGATION_ROUTE_NAME)
    object CalendarScreen : ScreensNavigation(CALENDAR_NAVIGATION_ROUTE_NAME)
    object UserScreen : ScreensNavigation(USER_NAVIGATION_ROUTE_NAME)
    object TeachersScreen : ScreensNavigation(TEACHER_NAVIGATION_ROUTE_NAME)
    object RatingScreen : ScreensNavigation(RATING_NAVIGATION_ROUTE_NAME)
    object SettingsScreen : ScreensNavigation(SETTINGS_NAVIGATION_ROUTE_NAME)
    object CursesScreen: ScreensNavigation(CURSES_NAVIGATION_ROUTE_NAME)
    object ProfessionScreen: ScreensNavigation(PROFESSION_NAVIGATION_ROUTE_NAME)
    object TermsAndConditionScreen: ScreensNavigation(TERMS_AND_CONDITIONS_NAVIGATION_ROUTE_NAME)
    object HelpAndQuestionScreen: ScreensNavigation(HELP_AND_QUESTION_NAVIGATION_ROUTE_NAME)
}
