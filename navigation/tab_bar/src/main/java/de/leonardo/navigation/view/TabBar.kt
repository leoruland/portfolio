package de.leonardo.navigation.view

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import de.leonardo.navigation.NavigationTarget

@Composable
fun TabBar(
    navController: NavController,
    navItems: List<NavigationTarget>,
    initialTarget: NavigationTarget? = navItems.first(),
) {
    var selectedItem by remember { mutableIntStateOf(navItems.indexOf(initialTarget)) }
    var currentRoute by remember { mutableStateOf(initialTarget?.destination) }

    navItems.forEachIndexed { index, navigationItem ->
        if (navigationItem.destination == currentRoute) {
            selectedItem = index
        }
    }

    NavigationBar {
        navItems.forEachIndexed { index, destination ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    currentRoute = destination.destination
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
