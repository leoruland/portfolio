package de.leonardo.navigation

import androidx.compose.ui.graphics.vector.ImageVector

interface NavigationDestination {
    val name: String
    val route: String
    val icon: ImageVector?
}
