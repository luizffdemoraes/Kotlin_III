package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco(logradouro = "Rua Vergueiro", complemento = "Alura")
    val enderecoNovo = Endereco(bairro = "Vila mariana", numero = 1000)



    println(endereco.equals((endereco)))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    //hashcode é uma forma de identificar o objeto todos objeto vai ter esse comportamento

    println(endereco.toString())
    println(enderecoNovo.toString())

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")



}









