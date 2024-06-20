package de.leonardo.defaultapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import de.leonardo.defaultapp.navigation.MainNavHost
import de.leonardo.model_feature.navigation.FeatureDestinations
import de.leonardo.navigation.view.TabBar
import de.leonardo.theme.default.DefaultAppTheme
import de.leonardo.theme.example.ExampleAppTheme

class ExampleMainActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navigationItems = listOf(
            FeatureDestinations.ShowGreeting,
            FeatureDestinations.Start,
            FeatureDestinations.ShowGoodbye,
        )
        setContent {
            val navController = rememberNavController()
            ExampleAppTheme {
                Scaffold(
                    topBar = {
                        BottomAppBar {
                            TabBar(navController = navController, navItems = navigationItems)
                        }
                    },
                    content = { paddingValues ->
                        val modifier = Modifier.padding(paddingValues)
                        MainNavHost(
                            modifier = modifier,
                            navController = navController,
                            startDestination = FeatureDestinations.Start,
                        )
                    },
                    bottomBar = {}
                )
            }
        }
    }
}
