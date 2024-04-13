package com.lannstark.lec18

import com.lannstark.lec17.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    val apples = fruits.filter { fruit -> fruit.name == "사과" }

    // filter 에서 인덱스가 필요하다면 filterIndexed 사용합니다.
    val apples2 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }

    // 사과의 가격들을 알기위해 filter 이후 map을 수행합니다.
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.price }

    // map에서 인덱스가 필요하다면 mapIndexed 를 사용합니다.
    val applePrices2 = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.price
        }

//    val values = fruits.filter { fruit -> fruit.name == "사과" }
//        .mapNotNull { fruit -> fruit.nullOrVale() }

    // groupBy
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    val map2: Map<String, List<Int>> =
        fruits.groupBy({ fruit -> fruit.name }, { fruit -> fruit.price })


    // flatten
    val numbers = listOf(listOf(1, 2, 3), listOf(4, 5), listOf(6))
    val result = numbers.flatten()
    println(result)

    // flatMap
    val result2 = numbers.flatMap { it.map { "number $it" } }
    println(result2)
}