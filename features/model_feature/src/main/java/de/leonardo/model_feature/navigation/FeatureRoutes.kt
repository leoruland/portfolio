package de.leonardo.model_feature.navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import de.leonardo.model_feature.view.GoodbyeScreen
import de.leonardo.model_feature.view.GreetingScreen

fun NavGraphBuilder.featureRoutes(
    modifier: Modifier,
    navController: NavController,
) {
    composable(FeatureDestinations.Start.destination) {
        GreetingScreen(
            modifier = modifier,
            onClick = { navController.navigate(FeatureDestinations.ShowGoodbye.destination) }
        )
    }

    composable(FeatureDestinations.ShowGreeting.destination) {
        GreetingScreen(
            modifier = modifier,
            onClick = { navController.navigate(FeatureDestinations.ShowGoodbye.destination) }
        )
    }

    composable(FeatureDestinations.ShowGoodbye.destination) {
        GoodbyeScreen(
            modifier = modifier,
            onClick = { navController.navigate(FeatureDestinations.ShowGreeting.destination) }
        )
    }
}