fun main(){
    val paulo = Analista("Paulo Prata", "12344", 4000.0)
    imprimirRelatorio(paulo)
}

fun imprimirRelatorio (funcionario: Funcionario) = println(funcionario.toString())