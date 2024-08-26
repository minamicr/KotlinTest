package com.minami.datatypes

fun main(args: Array<String>) {

    variableMethod(5, "desk", "chair", "table")

    val list = arrayOf("desk", "chair", "table")

    // the method wants vararg, it doesn't accept an array
    // we have to use spread operator *
    variableMethod(2, *list)

    val listNumber = arrayOf(1, 2, 3, 4)
    wantsAnArray(listNumber)



}

fun variableMethod (num: Int, vararg strings: String) {
    strings.forEach { println(it) }

}

fun wantsAnArray(list: Array<Int>) {
    list.forEach { println(it) }
}