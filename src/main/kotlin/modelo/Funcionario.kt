package modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double

) {
    //properties abistrato a classe mãe não e responsavel pela implementação
    abstract val bonificacao: Double

    //properties
//    open val bonificacao: Double
//        get() {
//            return salario * 0.1
//        }

    //function
//    open fun bonificacao(): Double {
//        return salario * 0.1
//    }

}