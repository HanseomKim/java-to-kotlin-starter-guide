package com.lannstark.lec10

interface Swimable {
    val swimAbility: Int
        get() = 1

    fun act() {
        println(swimAbility)
        println("어푸 어푸")
    }
}