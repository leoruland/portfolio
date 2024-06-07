package de.leonardo.defaultapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import de.leonardo.defaultapp.navigation.MainNavHost
import de.leonardo.model_feature.navigation.FeatureDestinations
import de.leonardo.theme.default.DefaultAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultAppTheme {
                Scaffold(
                    topBar = {},
                    content = { paddingValues ->
                        val modifier = Modifier.padding(paddingValues)
                        MainNavHost(
                            modifier = modifier,
                            navController = rememberNavController(),
                            startDestination = FeatureDestinations.Start,
                        )
                    },
                    bottomBar = {}
                )
            }
        }
    }
}
