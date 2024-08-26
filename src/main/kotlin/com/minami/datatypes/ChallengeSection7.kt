package com.minami.datatypes

import java.util.function.Predicate


fun main(args: Array<String>) {
    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val jean = Person("Jean", "Smithson", 66)

    // Map is immutable
    val people = mapOf<String, Person>(joe.lastName to joe,
        jane.lastName to jane,
        mary.lastName to mary,
        jean.lastName to jean)

    // Count how many people has lastName starting with S
    println(people.filter { it.value.lastName.startsWith("S")}.count())

    // Create list of Pair firstName | lastName and print
    // When using map, everything is executed for each entry
    val namePairs = people.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)

    // Destructuring the person to variables
    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")

    // also | it   apply | this
    people.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old ") }
    }

    people.apply {
        this.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }

    val list1 = listOf(4, 11, 50, 34, 90);
    val list2 = listOf(4, 34, 101, 403);
    println(list1.intersect(list2))

    val list3 = list1.filter { it in list2 }
    println(list3)

    val list4 = list1.filter { list2.contains(it)}
    println(list4)

    val regularPaper = Box<Regular>()

    var paper = Box<Paper>()

    paper = regularPaper

}

class Person(val firstName: String, val lastName: String, val age: Int) {
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age

    override fun toString(): String {
        return "FirstName: $firstName, LastName: $lastName, Age: $age"
    }

}

data class Person1(val firstName: String, val lastName: String, val age: Int) {
    // here you get destructuring for free

}

class Box<out T: Paper> {

}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}