import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "999.999.999.99", senha = 1234)

    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "Joao"

    var contaMaria = ContaPoupanca(
        titular = Cliente(
            nome = "Maria",
            cpf = "888.888.888.88",
            senha = 1234
        ),
        numero = 1003
    )
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}