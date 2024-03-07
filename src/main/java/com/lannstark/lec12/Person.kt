package com.lannstark.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
    moveSomething(object : Movable {
        override fun move() {
            println("Move!!")
        }

        override fun fly() {
            println("Fly!!")
        }
    })

}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}

class Person private constructor(
    private val name: String,
    private val age: Int,
) {

    companion object Factory : Log {                   // Java의 static 변수와 함수처럼 사용됩니다.
        private const val MIN_AGE = 0    // 컴파일 시 변수가 할당됩니다.

        // private val MIN_AGE = 0       // 런타임 시 변수가 할당됩니다.
        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory 입니다.")
        }
    }
}


object Singleton {
    var a: Int = 0
}
