package com.minami.datatypes

import java.math.BigDecimal

fun main(args: Array<String>) {

    //For using collections, you must define the type
    val list: MutableList<String> = mutableListOf("Hello")
    //Type infered from declaration
    val list1 = mutableListOf("Hello")
    list1.add("another string")
    topPrintCollection(list1)
    list1[0].uppercase()
    list1.set(0, list1[0].uppercase()) //change value of list
    topPrintCollection(list1)

    val bdList =  mutableListOf(
        BigDecimal(-33.45), BigDecimal(3503.99)
        )

    // Using top function
    topPrintCollection(bdList)

    // Using extension
    bdList.printCollection()

}

// Top level function
fun <T> topPrintCollection(collection: List<T>){
    for (item in collection) {
        println(item)
    }
}

// Function as an extension from List
fun <T> List<T>.printCollection() {
    for (item in this) {
        println(item)
    }
}