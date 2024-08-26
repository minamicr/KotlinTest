package com.minami.datatypes

fun main(args: Array<String>) {

    val shortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
    // convertToInt1(shortList) // 2 here the compiler complains to change the function
    // convertToInt1 to MutableList<Short>

}

fun convertToInt1(collection: MutableList<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
    //1
    //MutableList accepst the inclusion of double inside a collection of Short
    //It didn't use the out parameter to assure the subtype, it's not covariant
    //List is a covariant type, but it's immutable, and it doesn't accept add


    collection.add(25.3)
}

// Class and Subclass is more accurate than Generics Type and subtype
// List -> ListOfInt, ListOfShort is a subtype, doesn't extend anything
// Short is a subclass of Number (extends)
// ListOfNumber is a super type of ListOfShort
// Nullable type is wider type, you can store non nullabe types and null
// Non-nullable type can't store null
// Covariant the subtype is preserved, like using List
// Mutable is invariant, not covariant

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden) // only accepts garden of flowers
}
fun waterGarden(garden: Garden<Flower>) {

}
open class Flower {

}

class Rose: Flower() {

}

class Garden<out T: Flower> {
    // using out makes the collection covariant, it means that subtype is preserved
    // in this case you can use the type or subtype (Garden<Flower>, Garden<Rose>, Garden<Daisy>)
    // but there are some restrictions, like adding sth to it
    // allows out position - functions that return type
    // don't allow in position - functions that receives parameters, you can't insert new data in order
    // to guarantee the subtypes

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i] // out position
    //fun plantFlower(flower: T) { // in position
        // Type parameter T is declared as 'out' but occurs in 'in' position in type T
        // It doesn't accept because you could have a list with any kind of flower,
        // and it can't guarantee the type of them
    //}
}
//class Garden<T: Flower> { // this class is invariant
//
//}