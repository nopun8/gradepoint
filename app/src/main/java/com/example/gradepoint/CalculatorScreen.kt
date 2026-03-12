package com.example.gradepoint

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun CalculatorScreen(navController: NavController) {

    var grade1 by remember { mutableStateOf("") }
    var credit1 by remember { mutableStateOf("") }

    var grade2 by remember { mutableStateOf("") }
    var credit2 by remember { mutableStateOf("") }

    var grade3 by remember { mutableStateOf("") }
    var credit3 by remember { mutableStateOf("") }

    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        Text("CGPA Calculator", fontSize = 28.sp)

        OutlinedTextField(
            value = grade1,
            onValueChange = { grade1 = it },
            label = { Text("Course 1 Grade") }
        )

        OutlinedTextField(
            value = credit1,
            onValueChange = { credit1 = it },
            label = { Text("Course 1 Credit") }
        )

        OutlinedTextField(
            value = grade2,
            onValueChange = { grade2 = it },
            label = { Text("Course 2 Grade") }
        )

        OutlinedTextField(
            value = credit2,
            onValueChange = { credit2 = it },
            label = { Text("Course 2 Credit") }
        )

        OutlinedTextField(
            value = grade3,
            onValueChange = { grade3 = it },
            label = { Text("Course 3 Grade") }
        )

        OutlinedTextField(
            value = credit3,
            onValueChange = { credit3 = it },
            label = { Text("Course 3 Credit") }
        )

        Button(onClick = {

            val cgpa = calculateCGPA(
                grade1, credit1,
                grade2, credit2,
                grade3, credit3
            )

            result = "Your CGPA: %.2f".format(cgpa)

        }) {
            Text("Calculate")
        }

        Text(result)

        Button(onClick = {
            navController.navigate("info")
        }) {
            Text("Grade Info")
        }
    }
}