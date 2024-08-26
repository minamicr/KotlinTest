package com.minami.datatypes

fun main(args: Array<String>) {

    val cars1 = mutableListOf(Cars(), Cars())
    val cars2: MutableList<Cars> = mutableListOf()
    copyCars(cars1, cars2)

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()
    // copyCars(fords1, fords2) -> DOESN'T WORK because is not using generics
    copyCarsT(fords1, fords2)

    //copyCarsT(fords1, cars2) -> DOESN"T WORK

    val cars3: MutableList<Cars> = mutableListOf(Ford(), Ford()) // IT WORKS

    copyCarsCoVariance(fords1, cars2)

}

fun copyCars (source: MutableList<Cars>, destination: MutableList<Cars>) {
    for (car in source) {
        destination.add(car)
    }
}

fun <T>copyCarsT (source: MutableList<T>, destination: MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}

// Java -> List<? extends Car> COVARIANCE
//      -> List<? super Car> CONTRAVARIANCE
fun <T>copyCarsCoVariance (source: MutableList<out T>, destination: MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}

open class Cars {

}

class Toyota: Cars() {

}


class Ford: Cars() {

}