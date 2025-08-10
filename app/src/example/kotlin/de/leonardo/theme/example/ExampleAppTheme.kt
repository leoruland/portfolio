package de.leonardo.theme.example

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import de.leonardo.theme.default.defaultColorScheme

@Composable
fun ExampleAppTheme(
    colorScheme: ColorScheme = defaultColorScheme,
    typography: Typography = exampleTypography,
    shapes: Shapes = MaterialTheme.shapes,
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        shapes = shapes,
        content = content
    )
}