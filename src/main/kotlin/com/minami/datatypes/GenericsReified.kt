package com.minami.datatypes

import java.math.BigDecimal


fun main(args: Array<String>) {

    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5),
        "fall", BigDecimal(-5943.40))
    val bigDecimalsOnly = getElementsOfType<BigDecimal>(mixedList)
    for (item in bigDecimalsOnly) {
        println(item)
    }
}

inline fun <reified T> getElementsOfType(list: List<Any>): List<T>{
    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        // not declaring inline and reified in function, gives the error bellow
        // cannot check for instance of erased type T
        if (element is T) {
            newList.add(element)
        }
    }
    return newList
}

// inline functions can be reified, reification that prevents the type for being erased at runtime
// declare a function as inline and a type parameter as reified
// reified is only used to check the type of T in a function, you can't create new instances of T
// reification only works with inline function
