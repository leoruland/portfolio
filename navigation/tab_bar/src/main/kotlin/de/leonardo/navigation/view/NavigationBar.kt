package de.leonardo.navigation.view

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import de.leonardo.navigation.NavigationTarget

@Composable
fun NavigationBar(
    navController: NavController,
    navItems: List<NavigationTarget>,
) {
    BottomAppBar {
        val backStackEntry = navController.currentBackStackEntryAsState()
        navItems.forEach { destination ->
            NavigationBarItem(
                selected = destination.destination == backStackEntry.value?.destination?.route,//selectedItem == index,
                onClick = {
                    navController.navigate(destination.destination) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = { Icon(destination.icon ?: Icons.Default.Star, "") },
            )
        }
    }
}
