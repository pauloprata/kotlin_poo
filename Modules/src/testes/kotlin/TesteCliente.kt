package testes.kotlin

import Cliente

fun main() {
    val paulo = Cliente(
            nome = "Paulo Praa",
            cpf =" 12234",
            clienteTipo = ClienteTipo.PF,
            senha = "123487"
    )
    println(paulo)
    TesteAutenticacao().autentica(paulo)
}