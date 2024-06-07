package de.leonardo.model_feature.navigation

import de.leonardo.navigation.NavigationDestination

enum class FeatureDestinations(
    override val route: String
) : NavigationDestination {
    Start("navigation_feature_start"),
    ShowGreeting("navigation_feature_show_greeting"),
    ShowGoodbye("navigation_feature_show_goodbye")
}