import br.com.alura.bytebank.modelo.*
import novomodelo.Cliente as NovoCliente

//import java.lang.String as StringJava



fun main() {
//    println("Bem vindo ao Bytebank")
//    testaComportamentosConta()
//    testaFuncionarios()
//    testaContasDiferentes()
//    testaCopiasEReferencias()
//    testaFuncionarios()
//    testaAutenticacao()

//    val palavra: kotlin.String = ""
//    //Mesma coisa com uso do alias
////    val palavraJava: StringJava = StringJava("")
////    val palavraJava: java.lang.String = java.lang.String("")

//    val cliente = Cliente(nome = "Alex", cpf = "", senha = 1234)
//    //tecnica de utilizar apelidos no import para classes com mesmo nome para evitar conflito
//    val clienteNovo = NovoCliente()


    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111.11",
        Endereco(logradouro = "Rua Passaro"),
        senha = 1234
    )
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)


    testaContasDiferentes()

    println("Total de Contas: ${totalContas}")

}











