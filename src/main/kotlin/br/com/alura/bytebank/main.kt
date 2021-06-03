package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import testaFuncionarios

fun main() {

    //sobrecarga implicita
    val endereco = Endereco(logradouro = "")

    val objeto: Any = Any()

    //ao rodar em tempo de compilação em runtime ele vai se tornar object
    //imprime(Any())
    imprime(objeto)
    imprime(Unit)

    imprime(1) //sobrecarga
    imprime(1.0) //sobrecarga
    val teste: Any = imprime(endereco)
    println(teste)

    testaFuncionarios()
}

//tudo é um objeto - Unit mesmo não devolvendo nada e considerado um objeto, tudo vai retornar pelo menos um objeto
fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}








