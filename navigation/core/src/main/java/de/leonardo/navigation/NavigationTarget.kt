package de.leonardo.navigation

import androidx.compose.ui.graphics.vector.ImageVector

interface NavigationTarget {
    val name: String
    val destination: String
    val icon: ImageVector?
}
