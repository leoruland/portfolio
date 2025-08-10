package de.leonardo.model_feature.navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import de.leonardo.model_feature.view.GoodbyeScreen
import de.leonardo.model_feature.view.GreetingScreen
import de.leonardo.model_feature.view.StartScreen

fun NavGraphBuilder.featureRoutes(
    modifier: Modifier,
    navController: NavController,
) {
    composable(FeatureDestinations.Start.destination) {
        StartScreen(modifier = modifier)
    }

    composable(FeatureDestinations.ShowGreeting.destination) {
        GreetingScreen(
            modifier = modifier,
            onClick = {
                navController.popBackStack()
                navController.navigate(FeatureDestinations.ShowGoodbye.destination)
            }
        )
    }

    composable(FeatureDestinations.ShowGoodbye.destination) {
        GoodbyeScreen(
            modifier = modifier,
            onClick = {
                navController.popBackStack()
                navController.navigate(FeatureDestinations.ShowGreeting.destination)
            }
        )
    }
}