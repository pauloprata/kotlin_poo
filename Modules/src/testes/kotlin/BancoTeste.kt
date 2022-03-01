package testes.kotlin

import Banco


fun main(){
    val digiOneBank = Banco(nome ="digione", numero = 123)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco 2" )

    println(banco2.nome)
    println(banco2.numero)

}