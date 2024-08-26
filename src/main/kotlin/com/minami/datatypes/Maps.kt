package com.minami.datatypes

fun main(args: Array<String>) {

    val immutableMap = mapOf<Int, CarMaps>(1 to CarMaps("blue", "Toyota", 2015),
        2 to CarMaps("red", "Kia", 2023))

    println(immutableMap.javaClass) // LinkedHashMap
    println(immutableMap)

    val mutableMap = mutableMapOf("John's car" to CarMaps("red", "Toyota", 2004),
        "Mary's car" to CarMaps("blue", "Cherry", 2001))
    mutableMap.put("Elise's car", CarMaps("white", "Jaguar", 2012))
    println(mutableMap.javaClass) // LinkedHashMap
    println(mutableMap)
    println("USING ENTRY")
    for (entry in mutableMap) {
        println(" $entry.key = ${entry.value}")
    }

    println("DESTRUCTURING")
    for ((key, value) in mutableMap) {
        println(" $key = $value")
    }

    val hashMap = hashMapOf("John's car" to CarMaps("red", "Toyota", 2004),
        "Mary's car" to CarMaps("blue", "Cherry", 2001))
    hashMap.put("Elise's car", CarMaps("white", "Jaguar", 2012))
    println(hashMap.javaClass) // HashMap
    println(hashMap)

    val pair = Pair (10, "ten")
    val (first, second) = pair // destructuring
    println(first)
    println(second)

    val car = CarMaps("silver", "Corvette", 1950)
    val (color, model, year) = car // destructuring
    println("color: $color, model: $model, year: $year")

}

// for data class there is no need to declare destructuring, you got it for free
class CarMaps (val color: String, val model: String, val year: Int ) {
    operator fun component1() = color // declaration for destructuring
    operator fun component2() = model
    operator fun component3() = year

}