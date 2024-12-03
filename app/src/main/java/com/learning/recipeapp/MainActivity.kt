package com.learning.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.learning.recipeapp.ui.theme.RecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Ensure edge-to-edge is enabled
        setContent {
            RecipeAppTheme {
                // Wrapping Scaffold with a Surface for better theming consistency
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White // Or use MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        modifier = Modifier.fillMaxSize(),
                        contentColor = Color.Black // Optional: Ensures proper text color
                    ) { innerPadding ->
                        RecipeScreen(modifier = Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }
}