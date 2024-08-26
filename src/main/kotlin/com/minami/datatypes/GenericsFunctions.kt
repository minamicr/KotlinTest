package com.minami.datatypes

fun main(args: Array<String>) {

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short?> = listOf(10, 20, 30,40)
    val floats: List<Float?> = listOf(-10.349f, 20.932f, 30.12f)
    val strings = listOf("1", "2", "3")

    convertToInt(ints)
    convertToInt(shorts)
    convertToInt(floats)

    append(StringBuilder("Sring1"), StringBuilder("String2"))
    // printCollection(shorts) // ANY DOESN'T ALLOW null values

    if(strings is List<String>) {
        println("This list contains strings")
    }

    val listAny: Any = listOf("str1", "str2")
    //if (listAny is List<String>) -> ERROR it can't be verified
    if (listAny is List<*>)
        println("Yes, this is a list. Thank you star projection")

    if (listAny is List<*>) {
        println("This list contains strings")
        val strList = listAny as List<String> // CAST operation
        println(strList[1].replace("str", "string"))
    }
}

fun <T: Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}

fun <T> append(item1: T, item2: T)
    where T: CharSequence, T: Appendable {
        println("result is ${item1.append(item2)}")
    }

// ANY -> DON'T ALLOW nulls
fun <T: Any> printCollection(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}