package com.example.gradepoint

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun InfoScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        Text("Grade Information", fontSize = 26.sp)

        Text("A = 4.0")
        Text("B = 3.0")
        Text("C = 2.0")
        Text("D = 1.0")
        Text("F = 0.0")

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Back")
        }
    }
}