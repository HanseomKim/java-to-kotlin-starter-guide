package com.lannstark.lec14

fun main() {
    val dto1 = PersonDto("Kotlin", 100)
    val dto2 = PersonDto("Kotlin", 100)
    println(dto1 == dto2)
    println(dto1)
}

data class PersonDto(
    val name: String,
    val age: Int,
)