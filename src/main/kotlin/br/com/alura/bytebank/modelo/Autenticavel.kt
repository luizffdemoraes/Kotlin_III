package br.com.alura.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}

/*nos implementamos interfaces não herdamos
interface são contratos que qualquer um que implementar tera esses comportamentos
Ao fazer uma implementação padrão e utilizar uma propertie que sempre vai ser publica
geramos um problema pois perdemos o privilegio de restrição ainda mais sendo senha pois é uma
 informação sensivel. Ao realizar um implementação padrão  em um ainterface e que utilizaremos
 um propertie que será sobrescrita devemos tomar cuidado então se é uma informação sensivel
devemos evitar a implementação
exemplo
val senha: Int

 fun autentica(senha: Int): Boolean
{
    println("autentica interface")
    if (this.senha == senha) {
        return true
    }

    return false
}

*/





