package com.lannstark.lec19

import com.lannstark.lec18.Fruit
import com.lannstark.lec19.a.printHelloWorld as printHelloWorldA
import com.lannstark.lec19.b.printHelloWorld as printHelloWorldB


typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {

}

data class UltraSuperGuardianTribe(
    val name: String
)

typealias  USGTMap = Map<String, UltraSuperGuardianTribe>

data class Person(
    val name: String,
    val age: Int
)

class Person2(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main() {
    printHelloWorldA()
    printHelloWorldB()

    val person = Person("Kotlin", 100)
//    val (name, age) = person
    val name = person.component1()
    val age = person.component2()
    println("name: ${name}, age: ${age}")

    val person2 = Person2("Kotlin", 100)
    val (name2, age2) = person2
    println("name: ${name2}, age: ${age2}")

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@loop
            }
            println("${i} ${j}")
        }
    }

    println(getNumberOrNull(5))
    println(getNumberOrNull(-3))

}

fun getNumberOrNull(number: Int): Int? {
    return number.takeIf { it > 0 }
}

fun getNullOrNumber(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}