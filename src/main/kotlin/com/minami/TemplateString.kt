package com.minami

fun main(args: Array<String>) {
    val numerator = 10
    val denominator = 5

    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    val change = 4.22
    println("You can show $$change or the name of the variable \$change")

    val employee = Employee("Lynn Jones", 500)
    println("The employee's id is ${employee.id}")

    val filePath = """c:\somedir\somedir2"""  // triple quote string don't need to escape slash
    val eggName = "Humpty"
    val sentence = """$eggName dumpty sat on the wall
        |$eggName dumpy had a great fall
        |all the king's horses and all the king's men
        |couldn't put $eggName together again
    """.trimMargin().also {
        println(it)
    }
}
