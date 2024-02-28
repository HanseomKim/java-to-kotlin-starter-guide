package com.lannstark.lec08

fun main() {
    printAll("a", "b", "c")
    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

//fun max(a: Int, b: Int): Int {
//    return if (a > b) {
//        a
//    } else {
//        b
//    }
//}

//fun max(a: Int, b: Int): Int =
//    // if - else는 expression
//    if (a > b) {
//        a
//    } else {
//        b
//    }

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}