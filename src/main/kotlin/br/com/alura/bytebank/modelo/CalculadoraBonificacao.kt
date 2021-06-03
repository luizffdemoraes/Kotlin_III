package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    //    fun registra(funcionario: Funcionario) {
    fun registra(funcionario: Any) {
        //Casting conversão  as
        //Kotlin tem um recurso chamado smart casting
//        val funcionarioNovo: Funcionario = funcionario as Funcionario

        if (funcionario is Funcionario) { //mesma coisa que o de cima
            println("nome ${funcionario.nome}")
            this.total += funcionario.bonificacao
        }
    }
}