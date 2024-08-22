package model

class Funcionario: Pessoa() {


    var cargo: String= ""
    var salario: Double = 0.0

    override fun exibirDados(){
        println("Nome: $nome")
        println("Peso: $peso")
        println("Altura: $altura")
        println("Data Nasc: $dataNascimento")
        println("Idade: ${idade}")
        println("Cargo: $cargo")
        println("Salario:  $salario")
        println("-----------------------")

    }

}