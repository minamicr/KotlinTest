package com.minami.datatypes

fun main(args: Array<String>) {

    var str: String? = "ok" // ? indica que a variável pode ser nula
    var num: Int? = 5

    println(str?.uppercase()) // safety operator, if the variable is null, don't execute uppercase and return null
    println(num!!.mod(5)) // non null assertion, I guarantee that's not null and if it's throws an exception
    str?.let { println(it.uppercase()) } // don't execute let if str is null, returns blank
    str?.let { printText(it) } // don't execute let if str is null, returns blank

    val nullableInts = arrayOfNulls<Int?>(5)
    for (i in nullableInts) { println(i) }
    println(nullableInts[3].toString())


}

fun printText( str: String) {
    println(str)
}