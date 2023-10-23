package com.example.dailyuacm.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.dailyuacm.R
import com.example.dailyuacm.ui.utils.icons.UacmDailyIcons

data class NavigationItemDrawable(
    val title: Int? = 0,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean = false,
    val badgeCount: Int? = null,
    val route: String = ""
) {
    fun menuDrawableItems(): List<NavigationItemDrawable> {
        return listOf(
            NavigationItemDrawable(
                title = R.string.title_home_drawable,
                selectedIcon = UacmDailyIcons.homeFilled,
                unselectedIcon = UacmDailyIcons.homeOutline,
                hasNews = false,
                route = ScreensNavigation.HomeScreen.route
            ),
            NavigationItemDrawable(
                title = R.string.title_agenda_drawable,
                selectedIcon = UacmDailyIcons.agendaFilled,
                unselectedIcon = UacmDailyIcons.agendaOutlined,
                hasNews = false,
                route = ScreensNavigation.AgendaScreen.route
            ),
            NavigationItemDrawable(
                title = R.string.title_home_drawable,
                selectedIcon = UacmDailyIcons.homeFilled,
                unselectedIcon = UacmDailyIcons.homeOutline,
                hasNews = false,
                route = ScreensNavigation.HomeScreen.route
            ),
            NavigationItemDrawable(
                title = R.string.title_user_drawable,
                selectedIcon = UacmDailyIcons.userFilled,
                unselectedIcon = UacmDailyIcons.userOutLined,
                hasNews = false,
                route = ScreensNavigation.UserScreen.route
            ),
            NavigationItemDrawable(
                title = R.string.title_rating_drawable,
                selectedIcon = UacmDailyIcons.ratingFilled,
                unselectedIcon = UacmDailyIcons.ratingOutlined,
                hasNews = false,
                route = ScreensNavigation.RatingScreen.route
            ),
            NavigationItemDrawable(
                title = R.string.title_settings_drawable,
                selectedIcon = UacmDailyIcons.settingsFilled,
                unselectedIcon = UacmDailyIcons.settingsOutlined,
                hasNews = false,
                route = ScreensNavigation.SettingsScreen.route
            ),
            NavigationItemDrawable(
                title = R.string.title_courses_drawable,
                selectedIcon = UacmDailyIcons.cursesFilled,
                unselectedIcon = UacmDailyIcons.cursesOutlined,
                hasNews = false,
                route = ScreensNavigation.CursesScreen.route
            ),
            NavigationItemDrawable(
                title = R.string.title_teachers_drawable,
                selectedIcon = UacmDailyIcons.homeFilled,
                unselectedIcon = UacmDailyIcons.homeOutline,
                hasNews = false,
                route = ScreensNavigation.TeachersScreen.route
            ),
            NavigationItemDrawable(
                title = R.string.title_calendar_drawable,
                selectedIcon = UacmDailyIcons.calendarFilled,
                unselectedIcon = UacmDailyIcons.calendarOutlined,
                hasNews = false,
                route = ScreensNavigation.CalendarScreen.route
            ),
            NavigationItemDrawable(
                title = R.string.title_profession_drawable,
                selectedIcon = UacmDailyIcons.professionFilled,
                unselectedIcon = UacmDailyIcons.professionOutlined,
                hasNews = false,
                route = ScreensNavigation.ProfessionScreen.route
            ),
            NavigationItemDrawable(
                title = R.string.title_terms_and_condition_drawable,
                selectedIcon = UacmDailyIcons.policyFilled,
                unselectedIcon = UacmDailyIcons.policyOutlined,
                hasNews = false,
                route = ScreensNavigation.TermsAndConditionScreen.route
            ),
            NavigationItemDrawable(
                title = R.string.title_help_and_opinion_drawable,
                selectedIcon = UacmDailyIcons.helpAndOpinionFilled,
                unselectedIcon = UacmDailyIcons.helpAndOpinionOutlined,
                hasNews = false,
                route = ScreensNavigation.HelpAndQuestionScreen.route
            ),
        )
    }
}