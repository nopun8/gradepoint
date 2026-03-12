package com.example.gradepoint

fun gradeToPoint(grade: String): Double {
    return when (grade.uppercase()) {
        "A" -> 4.0
        "B" -> 3.0
        "C" -> 2.0
        "D" -> 1.0
        "F" -> 0.0
        else -> 0.0
    }
}

fun calculateCGPA(
    grade1: String, credit1: String,
    grade2: String, credit2: String,
    grade3: String, credit3: String
): Double {

    val c1 = credit1.toDoubleOrNull() ?: 0.0
    val c2 = credit2.toDoubleOrNull() ?: 0.0
    val c3 = credit3.toDoubleOrNull() ?: 0.0

    val p1 = gradeToPoint(grade1)
    val p2 = gradeToPoint(grade2)
    val p3 = gradeToPoint(grade3)

    val totalPoints = (p1 * c1) + (p2 * c2) + (p3 * c3)
    val totalCredits = c1 + c2 + c3

    return if (totalCredits > 0) totalPoints / totalCredits else 0.0
}