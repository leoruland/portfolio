package de.leonardo.theme.default

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import de.leonardo.theme.R

internal val fontFamilyFraktur = FontFamily(
    Font(R.font.leipzig_fraktur_normal, weight = FontWeight.W400),
    Font(R.font.leipzig_fraktur_bold, weight = FontWeight.W700),
)

internal val defaultTypography: Typography
    @Composable get() = MaterialTheme.typography.copy(
        displayLarge = MaterialTheme.typography.displayLarge.copy(
            fontSize = 57.sp,
            lineHeight = 64.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (-0.25).sp,
            fontFamily = fontFamilyFraktur,
        ),
        displayMedium = MaterialTheme.typography.displayMedium.copy(
            fontSize = 45.sp,
            lineHeight = 52.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            fontFamily = fontFamilyFraktur,
        ),
        displaySmall = MaterialTheme.typography.displaySmall.copy(
            fontSize = 36.sp,
            lineHeight = 44.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            fontFamily = fontFamilyFraktur,
        ),
        headlineLarge = MaterialTheme.typography.headlineLarge.copy(
            fontSize = 26.sp,
            lineHeight = 40.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            fontFamily = fontFamilyFraktur,
        ),
        headlineMedium = MaterialTheme.typography.headlineMedium.copy(
            fontSize = 24.sp,
            lineHeight = 36.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            fontFamily = fontFamilyFraktur,
        ),
        headlineSmall = MaterialTheme.typography.headlineSmall.copy(
            fontSize = 22.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            fontFamily = fontFamilyFraktur,
        ),
        titleLarge = MaterialTheme.typography.titleLarge.copy(
            fontSize = 20.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.W700,
            letterSpacing = 0.sp,
            fontFamily = fontFamilyFraktur,
        ),
        titleMedium = MaterialTheme.typography.titleMedium.copy(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.W700,
            letterSpacing = (0.15).sp,
            fontFamily = fontFamilyFraktur,
        ),
        titleSmall = MaterialTheme.typography.titleSmall.copy(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (0.1).sp,
            fontFamily = fontFamilyFraktur,
        ),
        labelLarge = MaterialTheme.typography.labelLarge.copy(
            fontSize = 16.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.W700,
            letterSpacing = (0.1).sp,
            fontFamily = fontFamilyFraktur,
        ),
        labelMedium = MaterialTheme.typography.labelMedium.copy(
            fontSize = 12.sp,
            lineHeight = 14.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (0.5).sp,
            fontFamily = fontFamilyFraktur,
        ),
        labelSmall = MaterialTheme.typography.labelSmall.copy(
            fontSize = 11.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (0.5).sp,
            fontFamily = fontFamilyFraktur,
        ),
        bodyLarge = MaterialTheme.typography.bodyLarge.copy(
            fontSize = 16.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (0.5).sp,
            fontFamily = fontFamilyFraktur,
        ),
        bodyMedium = MaterialTheme.typography.bodyMedium.copy(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (0.25).sp,
            fontFamily = fontFamilyFraktur,
        ),
        bodySmall = MaterialTheme.typography.bodySmall.copy(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = (0.4).sp,
            fontFamily = fontFamilyFraktur,
        )
    )
