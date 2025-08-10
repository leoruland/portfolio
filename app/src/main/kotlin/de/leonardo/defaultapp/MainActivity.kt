package de.leonardo.defaultapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import de.leonardo.navigation.NavigationTarget
import de.leonardo.navigation.view.TabBar
import de.leonardo.theme.default.DefaultAppTheme

abstract class MainActivity : ComponentActivity() {

    abstract val navigationItems: List<NavigationTarget>
    abstract val initialTarget: NavigationTarget

    @Composable
    abstract fun MainNavHost(modifier: Modifier, controller: NavHostController)

    @Composable
    open fun ApplicationContent(navHostController: NavHostController) {
        DefaultAppTheme {
            Scaffold(
                topBar = {},
                content = { paddingValues ->
                    MainNavHost(Modifier.padding(paddingValues), navHostController)
                },
                bottomBar = {
                    BottomAppBar {
                        TabBar(
                            navController = navHostController,
                            navItems = navigationItems,
                            initialTarget = initialTarget
                        )
                    }
                }
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            ApplicationContent(navController)
        }
    }
}
