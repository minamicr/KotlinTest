package com.minami
typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    val employee = Employee("Lynn Jones", 500)
    employee.name = "Lynn Smith"
    val employee1 = Employee("Lynn Smith", 500)
    val employee2 = employee1

    println(employee == employee1)
    println(employee.name.equals(employee1.name))
    println(employee === employee1)
    println(employee === employee2)

    var something: Any = employee2 // Any like object
    if (something is Employee) { // java -> instanceOf
        val newEmployee = something as Employee // cast in Kotlin
        println(newEmployee.name)

        println(something.name) // automatic cast
    }
    if (something !is Employee) {
        println("não é funcionário")
    }

    println(employee)

    val employees: EmployeeSet

    val names = arrayListOf("John", "Jane", "Mary" )
    println(names[1]) // java -> System.out.println(names.get(1));



}

class Employee (var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}