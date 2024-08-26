package com.minami.datatypes


fun main(args: Array<String>) {
    // don't need to instantiate the class, because companion
    // is like static
    println(StaticClass.Companion.accessPrivateVar())
    println(StaticClass.accessPrivateVar())
    println(NamedCompanion.Greeting.getExample())

    //FACTORY METHODS
    val someClass1 = SomeClass.justAssign("string as is")
    println(someClass1.someString)
    val someClass2 = SomeClass.upperOrLowerCase("upper", false)
    println(someClass2.someString)
    val someClass3 = SomeClass.upperOrLowerCase("lower", true)
    println(someClass3.someString)
    // Cannot instantiate the class because it's private
    // val someClass4 = SomeClass("test")

}


class StaticClass {

    // it's allowed just one companion object per class
    companion object { // everything here is static

        private var privateVar = 6

        fun accessPrivateVar() {
            println("I'm accessing privateVar: $privateVar")
        }
    }


}

class NamedCompanion {
    companion object Greeting {
        private var example = "hi"

        fun getExample() {
            println("$example there !")
        }
    }
}

//FACTORY
class SomeClass private constructor(val someString: String) {
    companion object {
        fun justAssign(str: String) = SomeClass(str)

        fun upperOrLowerCase(str: String, lowerCase: Boolean) : SomeClass {
            if (lowerCase) {
                return SomeClass(str.lowercase())
            } else {
                return SomeClass(str.uppercase())
            }
        }
    }
}