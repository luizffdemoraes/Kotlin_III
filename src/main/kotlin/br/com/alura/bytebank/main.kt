import br.com.alura.bytebank.modelo.Cliente
import novomodelo.Cliente as NovoCliente
//import java.lang.String as StringJava

fun main() {
//    println("Bem vindo ao Bytebank")
//    testaComportamentosConta()
//    testaFuncionarios()
    testaContasDiferentes()
//    testaCopiasEReferencias()
//    testaFuncionarios()
//    testaAutenticacao()

    val palavra: kotlin.String = ""
    //Mesma coisa com uso do alias
//    val palavraJava: StringJava = StringJava("")
//    val palavraJava: java.lang.String = java.lang.String("")


    val cliente = Cliente(nome = "Alex", cpf = "", senha = 1234)
    //tecnica de utilizar apelidos no import para classes com mesmo nome para evitar conflito
    val clienteNovo = NovoCliente()

}











