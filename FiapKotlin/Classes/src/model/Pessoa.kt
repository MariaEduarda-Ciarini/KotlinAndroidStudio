// Aula de Classes

package model

import java.time.LocalDate
import java.time.Period

class Pessoa {

    // Propriedes/campo/atributo do objeto
    var nome: String = ""
    var dataNascimento: LocalDate = LocalDate.of(2000, 6, 30)
    var peso: Int = 0
    var altura: Double = 0.0

    val idade: Int
        get() {
            return Period.between(dataNascimento, LocalDate.now()).years
        }


    // Métodos / Comportamento

    fun exibirDados() {
        println("Nome: $nome")
        println("Peso: $peso")
        println("Altura: $altura")
        println("Data Nasc: $dataNascimento")
        println("Idade: ${idade}")
        println("-----------------------")
    }

//    fun calcularIdade(): Int{
//        var idade = Period.between(dataNascimento, LocalDate.now()).years
//        return idade
//
//    }
}