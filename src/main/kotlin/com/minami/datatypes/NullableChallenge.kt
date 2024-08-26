package com.minami.datatypes

fun main(args: Array<String>) {

    val number1: Float? = -3847.384f
    val number2 = -3847.384

    val shortArray1 = shortArrayOf(1, 2, 3, 4, 5)
    shortArray1.forEach { println(it) }

    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)
    shortArray2.forEach { println(it) }


    val i:Int = 0
    val intArray = Array<Int?>(40){ i -> (i + 1) * 5 }
    intArray.forEach { println(it) }

    val char1: Array<Char> = arrayOf('a', 'b', 'c')
    getCharArray(char1)

    // Primitive char type, because of that the function doesn't work
    val char2 = charArrayOf('a', 'b', 'c')
    // getCharArray(char2)

    val x: String? = "I AM IN UPPERCASE"
    // when x isn't null, do lowercase
    // elvis operator assign the default value
    val y = x?.lowercase() ?: "I give up!"
    println(y)

    val x1: String? = "I AM IN UPPERCASE"

    x1?.let { println(it.lowercase().replace("am", "am not")) }

    val myNonNullVariable: Int? = null
    println(myNonNullVariable!!.toDouble())


}

fun getCharArray(array: Array<Char>) {
    array.forEach { println(it) }
}