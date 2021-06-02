package br.com.alura.bytebank.modelo

//variavel global
//var totalContas = 0
//    private set

abstract class Conta(
    //uma classe conta vai ter uma variavel do tipo Cliente - Composicao conta compoe um cliente
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    //companion object
    companion object  {
        var total = 0
            private set

//        fun incrementa(){
//            total++
//        }

    }

    //Comportamento similar ao contrutor secundario
    init {
        println("Criando conta")
        Companion.total++
//        totalContas++

    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }

}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}