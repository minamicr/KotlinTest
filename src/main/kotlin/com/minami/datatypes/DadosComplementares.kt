package com.minami.datatypes

class DadosComplementares (val pessoa: Pessoa){

    fun nomePessoa() : String {
        return pessoa.getNomePessoa()
    }

    fun idadePessoa() : Int {
        return pessoa.getIdadePessoa()
    }
}