class Gerente(
        nome: String,
        cpf: String,
        salario: Double)
    : Funcionario(nome = nome, cpf = cpf,salario= salario) {
    override fun calcularAuxilio(): Double = salario * 0.4

}