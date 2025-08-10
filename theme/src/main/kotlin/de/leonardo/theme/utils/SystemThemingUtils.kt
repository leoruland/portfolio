package de.leonardo.theme.utils

import android.app.Activity
import android.view.View
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp

fun setSystemBarColours(view: View, colourScheme: ColorScheme) {
    if (!view.isInEditMode) {
        val window = (view.context as Activity).window
        window.statusBarColor = colourScheme.primary.toArgb()
        window.navigationBarColor = colourScheme.surfaceColorAtElevation(3.dp).toArgb()
    }
}