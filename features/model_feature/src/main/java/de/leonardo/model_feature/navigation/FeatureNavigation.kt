package de.leonardo.model_feature.navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import de.leonardo.model_feature.view.GoodbyeScreen
import de.leonardo.model_feature.view.GreetingScreen

fun NavGraphBuilder.featureGraph(
    modifier: Modifier,
    navController: NavController,
) {
    composable(FeatureDestinations.Start.route) {
        GreetingScreen(
            modifier = modifier,
            onClick = { navController.navigate(FeatureDestinations.ShowGoodbye.route) }
        )
    }

    composable(FeatureDestinations.ShowGreeting.route) {
        GreetingScreen(
            modifier = modifier,
            onClick = { navController.navigate(FeatureDestinations.ShowGoodbye.route) }
        )
    }

    composable(FeatureDestinations.ShowGoodbye.route) {
        GoodbyeScreen(
            modifier = modifier,
            onClick = { navController.navigate(FeatureDestinations.ShowGreeting.route) }
        )
    }
}