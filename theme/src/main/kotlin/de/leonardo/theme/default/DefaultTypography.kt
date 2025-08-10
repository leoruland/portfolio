package de.leonardo.theme.default

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import de.leonardo.theme.R

internal val fontFamilyNeverMind = FontFamily(
    Font(R.font.never_mind_thin, weight = FontWeight.W100),
    Font(R.font.never_mind_extra_light, weight = FontWeight.W200),
    Font(R.font.never_mind_light, weight = FontWeight.W300),
    Font(R.font.never_mind_book, weight = FontWeight.W400),
    Font(R.font.never_mind_regular, weight = FontWeight.W500),
    Font(R.font.never_mind_medium, weight = FontWeight.W600),
    Font(R.font.never_mind_demi_bold, weight = FontWeight.W700),
    Font(R.font.never_mind_bold, weight = FontWeight.W800),
    Font(R.font.never_mind_extra_bold, weight = FontWeight.W900),
)

val defaultTypography: Typography
    @Composable get() = MaterialTheme.typography.copy(
        displayLarge = MaterialTheme.typography.displayLarge.copy(
            fontSize = 57.sp,
            lineHeight = 64.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (-0.25).sp,
            fontFamily = fontFamilyNeverMind,
        ),
        displayMedium = MaterialTheme.typography.displayMedium.copy(
            fontSize = 45.sp,
            lineHeight = 52.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            fontFamily = fontFamilyNeverMind,
        ),
        displaySmall = MaterialTheme.typography.displaySmall.copy(
            fontSize = 36.sp,
            lineHeight = 44.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            fontFamily = fontFamilyNeverMind,
        ),
        headlineLarge = MaterialTheme.typography.headlineLarge.copy(
            fontSize = 26.sp,
            lineHeight = 40.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            fontFamily = fontFamilyNeverMind,
        ),
        headlineMedium = MaterialTheme.typography.headlineMedium.copy(
            fontSize = 24.sp,
            lineHeight = 36.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            fontFamily = fontFamilyNeverMind,
        ),
        headlineSmall = MaterialTheme.typography.headlineSmall.copy(
            fontSize = 22.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            fontFamily = fontFamilyNeverMind,
        ),
        titleLarge = MaterialTheme.typography.titleLarge.copy(
            fontSize = 20.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.W700,
            letterSpacing = 0.sp,
            fontFamily = fontFamilyNeverMind,
        ),
        titleMedium = MaterialTheme.typography.titleMedium.copy(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.W700,
            letterSpacing = (0.15).sp,
            fontFamily = fontFamilyNeverMind,
        ),
        titleSmall = MaterialTheme.typography.titleSmall.copy(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (0.1).sp,
            fontFamily = fontFamilyNeverMind,
        ),
        labelLarge = MaterialTheme.typography.labelLarge.copy(
            fontSize = 16.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.W700,
            letterSpacing = (0.1).sp,
            fontFamily = fontFamilyNeverMind,
        ),
        labelMedium = MaterialTheme.typography.labelMedium.copy(
            fontSize = 12.sp,
            lineHeight = 14.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (0.5).sp,
            fontFamily = fontFamilyNeverMind,
        ),
        labelSmall = MaterialTheme.typography.labelSmall.copy(
            fontSize = 11.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (0.5).sp,
            fontFamily = fontFamilyNeverMind,
        ),
        bodyLarge = MaterialTheme.typography.bodyLarge.copy(
            fontSize = 16.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (0.5).sp,
            fontFamily = fontFamilyNeverMind,
        ),
        bodyMedium = MaterialTheme.typography.bodyMedium.copy(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (0.25).sp,
            fontFamily = fontFamilyNeverMind,
        ),
        bodySmall = MaterialTheme.typography.bodySmall.copy(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (0.4).sp,
            fontFamily = fontFamilyNeverMind,
        )
    )
