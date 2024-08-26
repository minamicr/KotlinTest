package com.minami.datatypes

fun main(args: Array<String>) {
    val pessoa = Pessoa("Cris", 43)
    val dadosCompl = DadosComplementares(pessoa)

    println(dadosCompl.nomePessoa())
    println(dadosCompl.idadePessoa())
}