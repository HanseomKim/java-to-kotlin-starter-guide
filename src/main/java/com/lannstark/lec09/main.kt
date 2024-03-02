package com.lannstark.lec09

fun main() {
    val person = Person("Kotlin", 100)
    println(person.name)
    println(person.age)
    val javaPerson = JavaPerson("Kotlin", 100)
    println(javaPerson.name)
    println(javaPerson.age)
}

class Person(
    name: String,
    var age: Int
) {                                          // primary constructor

    var name = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("init block")
    }

    constructor(name: String) : this(name, 1) { // secondary constructor
        println("secondary constructor")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

//    val isAdult: Boolean
//        get() = this.age >= 20

    val isAdult: Boolean
        get() {
            return this.age >= 20
        }

}