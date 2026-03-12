package com.example.gradepoint

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "calculator"
    ) {

        composable("calculator") {
            CalculatorScreen(navController)
        }

        composable("info") {
            InfoScreen(navController)
        }

    }
}