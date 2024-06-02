package de.leonardo.theme.default

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import de.leonardo.theme.R

internal val defaultColorScheme: ColorScheme
    @Composable get() = ColorScheme(
        primary = colorResource(id = R.color.primary),
        onPrimary = colorResource(id = R.color.onPrimary),
        primaryContainer = colorResource(id = R.color.primaryContainer),
        onPrimaryContainer = colorResource(id = R.color.onPrimaryContainer),
        inversePrimary = colorResource(id = R.color.inversePrimary),
        secondary = colorResource(id = R.color.secondary),
        onSecondary = colorResource(id = R.color.onSecondary),
        secondaryContainer = colorResource(id = R.color.secondaryContainer),
        onSecondaryContainer = colorResource(id = R.color.onSecondaryContainer),
        tertiary = colorResource(id = R.color.tertiary),
        onTertiary = colorResource(id = R.color.onTertiary),
        tertiaryContainer = colorResource(id = R.color.tertiaryContainer),
        onTertiaryContainer = colorResource(id = R.color.onTertiaryContainer),
        background = colorResource(id = R.color.background),
        onBackground = colorResource(id = R.color.onBackground),
        surface = colorResource(id = R.color.surface),
        onSurface = colorResource(id = R.color.onSurface),
        surfaceVariant = colorResource(id = R.color.surfaceVariant),
        onSurfaceVariant = colorResource(id = R.color.onSurfaceVariant),
        surfaceTint = colorResource(id = R.color.surfaceTint),
        inverseSurface = colorResource(id = R.color.inverseSurface),
        inverseOnSurface = colorResource(id = R.color.inverseOnSurface),
        error = colorResource(id = R.color.error),
        onError = colorResource(id = R.color.onError),
        errorContainer = colorResource(id = R.color.errorContainer),
        onErrorContainer = colorResource(id = R.color.onErrorContainer),
        outline = colorResource(id = R.color.outline),
        outlineVariant = colorResource(id = R.color.outlineVariant),
        scrim = colorResource(id = R.color.scrim),
    )