package de.leonardo.defaultapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import de.leonardo.navigation.NavigationTarget
import de.leonardo.navigation.view.NavigationBar
import de.leonardo.theme.default.DefaultAppTheme

abstract class MainActivity : ComponentActivity() {

    abstract val navigationItems: List<NavigationTarget>
    abstract val initialTarget: NavigationTarget

    @Composable
    abstract fun MainNavHost(modifier: Modifier, controller: NavHostController)

    @Composable
    open fun ApplicationContent(navHostController: NavHostController) {
        DefaultAppTheme {

            enableEdgeToEdge(
                statusBarStyle = SystemBarStyle.auto(
                    lightScrim = MaterialTheme.colorScheme.surface.toArgb(),
                    darkScrim = MaterialTheme.colorScheme.surface.toArgb(),
                ),
            )

            Scaffold(
                topBar = {},
                content = { paddingValues ->
                    MainNavHost(Modifier.padding(paddingValues), navHostController)
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            ApplicationContent(navController)
        }
    }
}
