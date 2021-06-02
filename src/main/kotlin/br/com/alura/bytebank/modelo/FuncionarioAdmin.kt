package br.com.alura.bytebank.modelo

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int

) : Funcionario(nome = nome, cpf = cpf, salario = salario
), Autenticavel {
    //properties abistrato a classe mãe não e responsavel pela implementação

    override fun autentica(senha: Int): Boolean {
        println("autentica funcionario admin")
        if (this.senha == senha) {
            return true
        }

        return false
    }
}