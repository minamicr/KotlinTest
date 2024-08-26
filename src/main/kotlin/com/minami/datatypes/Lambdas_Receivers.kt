package com.minami.datatypes

fun main(args: Array<String>) {
    println(countTo100_expression_apply())
    println(countTo100_expression())
    println(countTo100_receivers())
    println(countTo100())
}

// Lambda with expression body
fun countTo100_expression_apply() =
    StringBuilder().apply() {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
    }.toString()

// Lambda with expression body
fun countTo100_expression() = with(StringBuilder()) {
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
    toString()
}

// Lambda with block Body
fun countTo100_receivers() : String {
    val numbers = StringBuilder()
    return with(numbers) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }
}

fun countTo100(): String {
    val numbers = StringBuilder ()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}