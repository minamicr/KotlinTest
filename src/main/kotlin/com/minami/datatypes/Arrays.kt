package com.minami.datatypes

import com.minami.java.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    val names = arrayOf("John", "Jane", "Jill")
    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)  //Generics

    val ints = arrayOf(1, 2, 3, 4)

    println(longs2 is Array<Long>)
    println(ints is Array<Int>)

    println(longs2[2])

    val evenNumbers = Array(16) { i -> i * 2}
    for (number in evenNumbers){
        println(number)
    }

    val lotsOfNumbers = Array(100) { i -> i + 1}
    for (number in lotsOfNumbers) {
        println(number)
    }

    val allZeros = Array(100) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    for(number in someArray) {
        println(number)
    }

    someArray = Array(6) { i -> (i + 1) * 10} // change array lenght
    for(number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        println(element)

    }

    println("mixedArray is array of Any ${mixedArray.isArrayOf<Any>()} ")

    val intNumbers = intArrayOf(1, 3, 940, 320)
    DummyClass().printNumbers(intNumbers)

    var someOtherArray = IntArray(5)

    someOtherArray[1] = 34
    for (number in someOtherArray) {
        println(number)
    }
}