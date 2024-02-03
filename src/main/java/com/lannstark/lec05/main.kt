package com.lannstark.lec05

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else {
        "C"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        else -> "C"
    }
}

// 조건부에는 어떠한 expression이라도 들어갈 수 있습니다. (ex. is Type)
fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

// 조건부에서 여러 개의 조건을 동시에 검사할 수 있습니다. (쉼표(,)로 구분)
fun judgeNumber(number: Int) {
    when (number) {
        1, 0 -> println("0 또는 1입니다.")
        else -> println("0 또는 1이 아닙니다.")
    }
}

// (값)이 없을 수도 있습니다. (early return 처럼 동작)
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}






