package com.minami.datatypes

fun main(args: Array<String>) {
    val specialLaserPrinter = SpecialLaserPrinter("Brother 123", 453)
    specialLaserPrinter.printModel()

    println(specialLaserPrinter.bestSellingPrice())

}

abstract class Printer(val modelName: String){ // abstract is open by default
    open fun printModel() = println("The model name is $modelName")
    abstract fun bestSellingPrice(): Double // abstract is open by default
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName){

    //if don't want the method to be overriden, use final override fun
    override fun printModel() = println("The laser model name is $modelName")
    override fun bestSellingPrice(): Double = 129.99

}

class SpecialLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm) {
    override fun printModel() = println("this is my way")
}