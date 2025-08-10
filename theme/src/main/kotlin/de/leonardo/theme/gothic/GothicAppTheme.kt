package de.leonardo.theme.gothic

import android.app.Activity
import android.view.View
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import de.leonardo.theme.colourExtension.ExtendedColours
import de.leonardo.theme.colourExtension.LocalExtendedColours

@Composable
fun GothicAppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    typography: Typography = GothicTypography,
    shapes: Shapes = MaterialTheme.shapes,
    content: @Composable () -> Unit,
) {
    val colourScheme = when {
        useDarkTheme -> GothicDarkColorScheme
        else -> GothicLightColorScheme
    }

    val extendedColours = if (useDarkTheme) {
        ExtendedColours(
            userFriendlyChoice = colourScheme.secondary,
            commercialChoice = colourScheme.primary
        )
    } else {
        ExtendedColours(
            userFriendlyChoice = colourScheme.primary,
            commercialChoice = colourScheme.secondary
        )
    }

    val view = LocalView.current
    setSystemBarColours(view, colourScheme)

    CompositionLocalProvider(LocalExtendedColours provides extendedColours) {
        MaterialTheme(
            colorScheme = colourScheme,
            typography = typography,
            shapes = shapes,
            content = content
        )
    }
}

private fun setSystemBarColours(view: View, colourScheme: ColorScheme) {
    if (!view.isInEditMode) {
        val window = (view.context as Activity).window
        window.statusBarColor = colourScheme.primary.toArgb()
        window.navigationBarColor = colourScheme.surfaceColorAtElevation(3.dp).toArgb()
    }
}