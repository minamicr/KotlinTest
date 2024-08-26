package com.minami.datatypes

fun main(args: Array<String>) {
    val employees = listOf(Employee ("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002))

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smithson")

    "Some String".apply somestring@ {
        "Another String".apply {
            println(lowercase()) // println(this.lowercase())
            println(this@somestring.uppercase())
        }
    }


}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@ {
        if (it.lastName == lastName) {
            println("Yes, fount the last name $lastName")
            return@returnBlock
        }
    }

    println("Nope, not found $lastName")
}


data class Employee (val firstName: String, val lastName: String, val startYear: Int)

