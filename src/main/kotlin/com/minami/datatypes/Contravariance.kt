package com.minami.datatypes

fun main(args: Array<String>) {
    //*very repetitive
    val violetTender = object: FlowerCare<Violet> { // object = anonymous instance
        override fun prune(flowers: Violet) = println("I'm pruning a violet")
    }

    val violetGarden = Gardens<Violet>(listOf(Violet(), Violet()), violetTender)
    violetGarden.tendFlower(0)

    //*very repetitive
    val daffodilTender = object: FlowerCare<Daffodil> {
        override fun prune(flowers: Daffodil) = println("I'm pruning a daffodil")
    }

    val daffodilGarden = Gardens<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), daffodilTender)
    daffodilGarden.tendFlower(2)

    // bellow it doesn't work with flowerTender because of covariance, it's preserving the subtype
    // it should be FlowerCare<Daffodil> instead of FlowerCare<Flower>
    val flowerTender = object: FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("I'm tending a flower")
    }

    //val daffodilGarden1 = Gardens<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), flowerTender)
    //daffodilGarden1.tendFlower(2)

    //* using Contravariance (in) you can develop a method using flower (super class) that accepts
    //both roses and daffodil. But you can't read you just write to it

    val flowerTenderContraVar = object: FlowerCareContraVar<Flowers> {
        override fun prune(flowers: Flowers) = println("I'm tending a ${flowers.name} using contravariance")
    }
    val daffodilGarden2 = GardensContraVar<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), flowerTenderContraVar)
    daffodilGarden2.tendFlower(2)
}

class Gardens<T: Flowers> (val flowers: List<T>,val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }

}
open class Flowers (val name: String){

}

class Violet: Flowers("Rose") {

}

class Daffodil: Flowers("Daffodil") {

}

interface FlowerCare<T> {
    fun prune(flowers: T) // prune = podar
}

interface FlowerCareContraVar<in T> { //CONTRAVARIANCE uses IN
    fun prune(flowers: T) // prune = podar
    // fun pick(): T - USING CONTRAVARIANCE (in) you can't read the parameter (just when using out)
    // because a rose is a flower, but a flower might be a rose, it could be another type
}

class GardensContraVar<T: Flowers> (val flowers: List<T>,val flowerCare: FlowerCareContraVar <T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }

}
//COVARIANCE preserve the subtyping, accept everything bellow
//CONTRAVARIANCE is the opposite and want to accept the subclass or the super classes. Thinking
// in a tree, accepts everything from the same level and above it
