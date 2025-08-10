package de.leonardo.defaultapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import de.leonardo.model_feature.navigation.FeatureDestinations
import de.leonardo.model_feature.navigation.featureRoutes
import de.leonardo.navigation.NavigationTarget

class WhitelabelMainActivity : MainActivity() {

    override val navigationItems: List<NavigationTarget> = listOf(
        FeatureDestinations.ShowGreeting,
        FeatureDestinations.ShowGoodbye,
    )
    override val initialTarget: NavigationTarget = FeatureDestinations.ShowGreeting

    @Composable
    override fun MainNavHost(modifier: Modifier, navHostController: NavHostController) =
        NavHost(
            modifier = modifier,
            navController = navHostController,
            startDestination = initialTarget.destination,
        ) {
            featureRoutes(Modifier, navHostController)
        }
}
