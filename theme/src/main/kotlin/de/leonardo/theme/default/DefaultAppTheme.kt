package de.leonardo.theme.default

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalView
import de.leonardo.theme.utils.setSystemBarColours

@Composable
fun DefaultAppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    typography: Typography = defaultTypography,
    shapes: Shapes = MaterialTheme.shapes,
    content: @Composable () -> Unit,
) {
    val colourScheme = when {
        useDarkTheme -> defaultColorScheme
        else -> defaultColorScheme
    }

    val view = LocalView.current
    setSystemBarColours(view, colourScheme)

    MaterialTheme(
        colorScheme = colourScheme,
        typography = typography,
        shapes = shapes,
        content = content
    )
}