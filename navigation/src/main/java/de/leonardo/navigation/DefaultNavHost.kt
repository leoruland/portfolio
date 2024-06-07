package de.leonardo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import java.lang.reflect.Modifier

@Composable
fun DefaultNavHost(
    modifier: Modifier,
    navController: NavHostController,
    startDestination: String,// = NavigationItem.Splash.route,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    )
    {

    }
}