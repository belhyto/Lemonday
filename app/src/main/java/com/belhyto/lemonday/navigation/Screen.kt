package com.belhyto.lemonday.navigation
//defining the screens in the app
sealed class Screen(val route: String) {
    object Splash: Screen("splash_screen")
    object Home: Screen("home_screen")
    //object Details: Screen("Details_screen")
    object Menu: Screen("menu_screen")
}