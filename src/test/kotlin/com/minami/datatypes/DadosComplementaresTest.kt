package com.minami.datatypes

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers.anyString
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class DadosComplementaresTest {

    @Mock
    lateinit var pessoa: Pessoa

    @InjectMocks
    lateinit var dadosComplementares: DadosComplementares

    @Test
    fun testDadosComplementares() {
        val pessoa = Pessoa("Cris", 33)
        `when`(pessoa.getNomePessoa()).thenReturn("Cris")
        `when`(pessoa.getIdadePessoa()).thenReturn(33)

        val resultNome = dadosComplementares.nomePessoa()
        val resultIdade = dadosComplementares.idadePessoa()

        assertEquals(pessoa.nome, resultNome)
        assertEquals(pessoa.idade, resultIdade)

    }


}