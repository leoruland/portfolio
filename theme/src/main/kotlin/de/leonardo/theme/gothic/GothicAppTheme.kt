package de.leonardo.theme.gothic

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
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

    CompositionLocalProvider(LocalExtendedColours provides extendedColours) {
        MaterialTheme(
            colorScheme = colourScheme,
            typography = typography,
            shapes = shapes,
            content = content
        )
    }
}
