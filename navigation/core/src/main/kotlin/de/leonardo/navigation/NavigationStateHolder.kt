package de.leonardo.navigation

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class NavigationStateHolder {
    private var _navigationState = MutableStateFlow<NavigationTarget?>(null)
    fun setNavigationState(target: NavigationTarget) {
        _navigationState.value = target
    }

    val navigationState = _navigationState.asStateFlow()

    companion object {
        val instance = NavigationStateHolder()
    }
}