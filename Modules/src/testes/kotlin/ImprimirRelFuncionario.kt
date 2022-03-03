package testes.kotlin

import Funcionario

class ImprimirRelFuncionario {

    companion object{
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}