package com.minami.datatypes


class Something: MySubInterface{

    override val number: Int = 25

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun MyFunctrion(str: String): String {
        TODO("Not yet implemented")
    }

}

interface MyInterface {
    val number: Int // property in interface
    val number2: Int // concrete property in interface
        get() = number * 100

    fun MyFunctrion(str: String): String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): String
}