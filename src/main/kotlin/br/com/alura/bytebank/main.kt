package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println()
    println(1)
    println(1.0)
    println(true)
    println("teste")

    //sobrecarga implicita
    val endereco = Endereco(logradouro = "")

    //impressão de objetos
    println(endereco)

    imprime()
    imprime(1) //sobrecarga
    imprime(1.0) //sobrecarga
    imprime(endereco)
}

//sobrecarga
fun imprime(){

}

fun imprime(valor: Int){

}

fun imprime(valor: Double){

}


fun imprime(endereco: Endereco){

}








