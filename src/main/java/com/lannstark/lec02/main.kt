package com.lannstark.lec02

fun main() {
    val person = Person(null)
    startsWithA(person.name)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw java.lang.IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}
