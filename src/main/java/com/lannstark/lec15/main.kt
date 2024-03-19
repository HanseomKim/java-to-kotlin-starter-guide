package com.lannstark.lec15

fun main() {
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    // List
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>() // 비어있는 리스트의 경우 타입을 명시해 주어야 합니다.

    printNumbers(emptyList())
    // get
    println(numbers.get(0))
    println(numbers[0])

    // For Each
    for (number in numbers) {
        println(number)
    }

    // 전통적인 for문
    for ((index, number) in numbers.withIndex()) {
        println("$index $number")
    }

    // 가변 리스트
    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300)

    // Set
    val setNumbers = setOf(100, 200)

    // For Each
    for (number in setNumbers) {
        println(number)
    }

    // 전통적인 for문
    for ((index, number) in numbers.withIndex()) {
        println("$index $number")
    }

    // Map
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }

}

private fun printNumbers(numbers: List<Int>) {

}