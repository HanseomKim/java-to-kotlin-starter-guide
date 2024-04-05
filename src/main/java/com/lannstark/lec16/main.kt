package com.lannstark.lec16

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

inline fun Int.add3(other: Int): Int {
    return this + other
}

fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다.")
        }
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}

fun main() {
    val person = Person("A", "B", 100)
    person.nextYearAge()

    println(3.add(4))
    println(3.add2(4))
    println(3 add2 4)
}
