package com.minami.datatypes


fun main(args: Array<String>) {
    val car = Car("blue", "Toyota", 2024)
    val car1 = Car("blue", "Toyota", 2024)
    println(car == car1) // equals comparing data TRUE
    val car3 = car.copy() // copying all data
    val car4 = car.copy(year = 2016) // copying everything except the year
    println(car == car3) // return TRUE, exactly same data
    println(car === car3) // return FALSE, different instances


}

data class Car(val color: String, val model: String, val year: Int) {
    // needs a primary constructor
    // can't be abstract and sealed or inner classes
    // custom implementation toString, equals, hashcode,copy
    // it can be override for using different implementation

}