package de.leonardo.defaultapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import de.leonardo.model_feature.navigation.featureGraph
import de.leonardo.navigation.NavigationDestination

@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: NavigationDestination,
) {
    NavHost(navController = navController, startDestination = startDestination.route) {
        featureGraph(
            modifier = modifier,
            navController = navController,
        )
    }
}