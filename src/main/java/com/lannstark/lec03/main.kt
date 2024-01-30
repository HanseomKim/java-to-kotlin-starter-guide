package com.lannstark.lec03

fun main() {
    printAgeIfPersonNullable(null)

    val person = Person("Kotlin", 100)
    // Java: System.out.println(String.format("이름: %s", person.name))
    println("이름: ${person.name}")

    var str = """
        ABC
        EFG
        
    """.trimIndent()
    println(str)
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) { // is: Java의 instanceof
        val person = obj // as Person(생략가능): Java의 (Person) obj
        println(person.age)
    }
}

fun printAgeIfPersonNullable(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}