package de.leonardo.theme.colourExtension

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class ExtendedColours(
    val userFriendlyChoice: Color,
    val commercialChoice: Color,
)

val LocalExtendedColours = staticCompositionLocalOf<ExtendedColours> {
    ExtendedColours(Color.Unspecified, Color.Unspecified)
}

val MaterialTheme.extendedColours: ExtendedColours
    @Composable
    @ReadOnlyComposable
    get() = LocalExtendedColours.current