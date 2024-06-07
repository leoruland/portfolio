package de.leonardo.model_feature.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import de.leonardo.features.model_feature.R
import de.leonardo.theme.default.DefaultAppTheme

@Composable
fun GreetingScreen(text: String, modifier: Modifier = Modifier) {
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.greeting_line, text),
            style = MaterialTheme.typography.headlineLarge,
            modifier = modifier,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    DefaultAppTheme {
        GreetingScreen(stringResource(R.string.mock_statement))
    }
}