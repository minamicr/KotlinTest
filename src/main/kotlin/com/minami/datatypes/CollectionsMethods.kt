package com.minami.datatypes

fun main(args: Array<String>) {
    val strings = listOf("winter", "spring", "summer", "fall", "summer")

    println(strings.last())
    println(strings.reversed())
    println(strings)
    println(strings.getOrNull(6))

    val colors = listOf("red", "white", "blue", "red", "blue")
    println(strings.zip(colors)) // it creates Pair<A, B> [(winter, red), (spring, white), (summer, blue)]

    val mergedList = listOf(strings, colors)
    println(mergedList) // creates list with 2 lists [[winter, spring, summer, fall], [red, white, blue]]

    val combinedList = strings + colors
    println(combinedList)

    var noDupList = strings.union(colors)
    println(noDupList)

    var noDupColors = colors.distinct()
    println(noDupColors)

    var mutableList = strings.toMutableList()
    mutableList.add("some other season")
    println(mutableList)
}