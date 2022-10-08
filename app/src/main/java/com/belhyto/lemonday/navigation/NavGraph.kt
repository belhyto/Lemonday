package com.belhyto.lemonday.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.belhyto.lemonday.LemonSplash
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import com.belhyto.lemonday.LemonWelcome
import com.belhyto.lemonday.LemondayMenu



@Composable
fun SetupNavGraph(navController: NavHostController)
{
    NavHost(navController = navController,
        startDestination =Screen.Splash.route )
    {
        composable(route = Screen.Splash.route)
        {
            LemonSplash(navController=navController)
        }
        composable(route= Screen.Home.route)
        {
           LemonWelcome(navController=navController)
        }
        composable(route= Screen.Menu.route)
        {
            LemondayMenu(navController=navController)
        }

    }
}