package de.leonardo.theme.default

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable

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

    MaterialTheme(
        colorScheme = colourScheme,
        typography = typography,
        shapes = shapes,
        content = content
    )
}