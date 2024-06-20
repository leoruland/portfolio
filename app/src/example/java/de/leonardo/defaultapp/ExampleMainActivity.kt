package de.leonardo.defaultapp

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import de.leonardo.model_feature.navigation.FeatureDestinations
import de.leonardo.model_feature.navigation.featureRoutes
import de.leonardo.navigation.NavigationTarget
import de.leonardo.navigation.view.TabBar
import de.leonardo.theme.example.ExampleAppTheme

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
            ExampleAppTheme {
                Scaffold(
                    topBar = {
                        BottomAppBar {
                            TabBar(
                                navController = navHostController,
                                navItems = navigationItems,
                                initialTarget = initialTarget,
                            )
                        }
                    },
                    content = { paddingValues ->
                        val modifier = Modifier.padding(paddingValues)
                        MainNavHost(
                            modifier = modifier,
                            navHostController = navHostController,
                        )
                    },
                    bottomBar = {}
                )
            }
        }
    }
}
