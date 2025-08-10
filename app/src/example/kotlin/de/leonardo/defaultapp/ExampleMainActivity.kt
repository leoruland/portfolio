package de.leonardo.defaultapp

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import de.leonardo.model_feature.navigation.FeatureDestinations
import de.leonardo.model_feature.navigation.featureRoutes
import de.leonardo.navigation.NavigationTarget
import de.leonardo.navigation.view.NavigationBar
import de.leonardo.theme.colourExtension.extendedColours
import de.leonardo.theme.gothic.GothicAppTheme

class ExampleMainActivity : MainActivity() {

    override val navigationItems: List<NavigationTarget> = listOf(
        FeatureDestinations.ShowGreeting,
        FeatureDestinations.Start,
        FeatureDestinations.ShowGoodbye,
    )

    override val initialTarget: NavigationTarget = FeatureDestinations.Start

    @Composable
    override fun MainNavHost(modifier: Modifier, navHostController: NavHostController) =
        NavHost(
            modifier = modifier,
            navController = navHostController,
            startDestination = initialTarget.destination,
        ) {
            featureRoutes(Modifier, navHostController)
        }

    @Composable
    override fun ApplicationContent(navHostController: NavHostController) {
        setContent {
            GothicAppTheme {
                Scaffold(
                    containerColor = MaterialTheme.extendedColours.userFriendlyChoice,
                    topBar = {},
                    content = { paddingValues ->
                        val modifier = Modifier.padding(paddingValues)
                        MainNavHost(
                            modifier = modifier,
                            navHostController = navHostController,
                        )
                    },
                    bottomBar = {
                        NavigationBar(
                            navController = navHostController,
                            navItems = navigationItems,
                        )
                    }
                )
            }
        }
    }
}
