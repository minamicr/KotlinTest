package com.minami.datatypes

fun main(args: Array<String>) {

    // List bellow is immutable, can't use add, set
    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass) // java.util.Arrays$ArrayList

    val emptyList: List<String> =  emptyList()
    val emptyList2 = emptyList<String>() // or var strings1 = listOf<String>()
    println(emptyList.javaClass) // kotlin.collections.EmptyList

    if (!emptyList.isEmpty()) {
        println(emptyList[0])
    }

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList) // it takes out the null value

    val arrayList = arrayListOf(1, 2, 3, 4) // mutable
    println(arrayList.javaClass) // java.util.ArrayList

    val mutableList = mutableListOf<Int>(1, 2, 3) // mutable
    println(mutableList.javaClass)

    println(mutableList[2])
    mutableList[1] = 20
    mutableList.set(2, 25)
    println(mutableList)

    val array = arrayOf("black", "white", "green")
    val colorList = listOf(array) // creates an array with all the elements
    println(colorList) // [[Ljava.lang.String;$3842049]

    val colorList1 = listOf(*array) // spread operator to separate elements
    println(colorList1)

    val colorList2 = array.toList()
    println(colorList2)

    val ints = intArrayOf(1, 2, 3)
    println(ints.toList())

}