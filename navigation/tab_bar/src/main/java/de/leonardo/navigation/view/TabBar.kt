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
import de.leonardo.navigation.NavigationDestination

@Composable
fun TabBar(
    navController: NavController,
    navItems: List<NavigationDestination>,
    initDestination: NavigationDestination = navItems.first(),
) {

    var selectedItem by remember { mutableIntStateOf(0) }
    var currentRoute by remember { mutableStateOf(initDestination.route) }

    navItems.forEachIndexed { index, navigationItem ->
        if (navigationItem.route == currentRoute) {
            selectedItem = index
        }
    }

    NavigationBar {
        navItems.forEachIndexed { index, target ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    currentRoute = target.route
                    navController.navigate(target.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = { Icon(target.icon ?: Icons.Default.Star, "") },
            )
        }
    }
}
