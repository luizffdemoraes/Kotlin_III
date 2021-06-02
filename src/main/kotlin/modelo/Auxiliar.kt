package modelo

import modelo.Funcionario
//fully qualified name

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double,
    //Herança reutilizar comportamentos
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    //É obrigatorio realizar a implementação ao realizar a ao herdade de funcionário
    override val bonificacao: Double
        get() {
            println("bonificação analista")
            return salario * 0.05
        }


}