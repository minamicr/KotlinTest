package com.minami.datatypes

import com.minami.java.DummyClass

fun main(args: Array<String>) {
    val myInt = 10
    println("default datatype is Int ${myInt is Int}")
    var myLong = 22L
    val myLong1 : Long = 22

    myLong = myInt.toLong()

    // Java works, but Kotlin has to convert int myInt = 10; long myLong = myInt;

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    val anotherInt = 5

    var myDouble = 65.984
    println(myDouble is Double)

    val myFloat = 838.84392f
    println("this is a float ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    val myCharInt = 65
    println(myCharInt.toChar())

    val myBoolean = true

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime) //called Java class
    println(onVacation)

    val anything: Any // equivalent to Object in Java

    val nothing: Nothing // never going to return (infinite loop)

}