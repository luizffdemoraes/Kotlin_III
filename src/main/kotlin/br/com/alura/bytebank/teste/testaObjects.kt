package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*
import testaContasDiferentes

fun testaObjects() {

    //objeto anonimo - menbros momento de utilização estrutura de objeto mais não quer implementação
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha

    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, senha = 1000)

    println("nome do cliente ${fran.nome}")

    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111.11",
        Endereco(logradouro = "Rua Passaro"),
        senha = 1234
    )
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)


    testaContasDiferentes()

    println("Total de Contas: ${Conta.total}")
}