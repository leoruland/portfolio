package de.leonardo.theme.default

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
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
    setSystemBarColours(
        view = view,
        statusBarColor = colourScheme.surface.toArgb(),
        navigationBarColor = colourScheme.surfaceColorAtElevation(3.dp).toArgb(),
        useDarkIcons = !useDarkTheme,
    )

    MaterialTheme(
        colorScheme = colourScheme,
        typography = typography,
        shapes = shapes,
        content = content
    )
}