package de.leonardo.theme.utils

import android.app.Activity
import android.view.View
import androidx.annotation.ColorInt
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.core.view.WindowCompat

@Composable
fun setSystemBarColours(
    view: View,
    @ColorInt statusBarColor: Int,
    @ColorInt navigationBarColor: Int,
    useDarkIcons: Boolean = false
) {
    val window = (view.context as Activity).window
    if (!view.isInEditMode) {
        window.statusBarColor = statusBarColor
        window.navigationBarColor = navigationBarColor
    }
    SideEffect {
        WindowCompat.getInsetsController(window, window.decorView).apply {
            isAppearanceLightStatusBars = useDarkIcons
            isAppearanceLightNavigationBars = useDarkIcons
        }
    }
}