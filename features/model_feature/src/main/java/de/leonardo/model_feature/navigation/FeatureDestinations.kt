package de.leonardo.model_feature.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material.icons.filled.AirplanemodeActive
import androidx.compose.material.icons.filled.AirplanemodeInactive
import androidx.compose.ui.graphics.vector.ImageVector
import de.leonardo.navigation.NavigationTarget

sealed class FeatureDestinations(
    override val name: String,
    override val destination: String,
    override val icon: ImageVector? = null,
) : NavigationTarget {
    data object Start :
        FeatureDestinations(name = "Start", destination = "navigation_feature_start", icon = Icons.Default.AcUnit)

    data object ShowGreeting : FeatureDestinations(
        name = "Greeting",
        destination = "navigation_feature_show_greeting",
        icon = Icons.Default.AirplanemodeActive,
    )

    data object ShowGoodbye : FeatureDestinations(
        name = "Goodbye",
        destination = "navigation_feature_show_goodbye",
        icon = Icons.Default.AirplanemodeInactive,
    )
}