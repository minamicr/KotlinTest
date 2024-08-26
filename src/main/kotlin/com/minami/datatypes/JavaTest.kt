@file:JvmName("StaticBus")

package com.minami.datatypes

import java.io.IOException

data class Bus(val color: String, @JvmField var model: String, var year: Int) {

    companion object {
        const val constant = 25
        @JvmField val isAuto = false
        @JvmStatic fun busCompanion () = println("I'm in Car's companion object")
    }
    fun printMe(argument: String) = println("argument is $argument")


}

object SingletonObj {
    @JvmStatic fun doSomething() = println("I'm doing something in the singleton object")
}

@Throws(IOException::class)
fun doIO() {
    throw IOException()
}

// function with optional parameter, because it considers 25 default value
// The JvmOverloads generates both functions with num and without num
@JvmOverloads
fun defaultArgs(str: String, num: Int = 25) {
    println("$str $num")

}