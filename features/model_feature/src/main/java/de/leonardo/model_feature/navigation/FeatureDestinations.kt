package de.leonardo.model_feature.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material.icons.filled.AirplanemodeActive
import androidx.compose.material.icons.filled.AirplanemodeInactive
import androidx.compose.ui.graphics.vector.ImageVector
import de.leonardo.navigation.NavigationDestination

sealed class FeatureDestinations(
    override val name: String,
    override val route: String,
    override val icon: ImageVector? = null,
) : NavigationDestination {
    data object Start :
        FeatureDestinations(name = "Start", route = "navigation_feature_start", icon = Icons.Default.AcUnit)

    data object ShowGreeting : FeatureDestinations(
        name = "Greeting",
        route = "navigation_feature_show_greeting",
        icon = Icons.Default.AirplanemodeActive,
    )

    data object ShowGoodbye : FeatureDestinations(
        name = "Goodbye",
        route = "navigation_feature_show_goodbye",
        icon = Icons.Default.AirplanemodeInactive,
    )
}