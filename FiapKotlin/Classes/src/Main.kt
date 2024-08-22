// Aula de Classes e Herança

import model.Funcionario
import model.Pessoa
import java.time.LocalDate

fun main() {

    var pessoa = Pessoa()
    pessoa.nome = "Maria"
    pessoa.peso = 100
    pessoa.exibirDados()

    var funcionario = Funcionario()
    funcionario.nome = "Bruce Wayne"
    funcionario.altura = 1.90
    funcionario.peso = 95
    funcionario.cargo = "Desenvolvedor Full Stack"
    funcionario.salario = 25000.00

    funcionario.exibirDados()

//    Nome: Maria
//    Peso: 100
//    Altura: 0.0
//    Data Nasc: 2000-06-30
//    Idade: 24
//    -----------------------
//    Nome: Bruce Wayne
//    Peso: 95
//    Altura: 1.9
//    Data Nasc: 2000-06-30
//    Idade: 24
//    Cargo: Desenvolvedor Full Stack
//    Salario:  25000.0
//    -----------------------



//    val pessoa = Pessoa()
//    pessoa.nome = "Michael Jackson"
//    pessoa.altura = 1.80
//    pessoa.peso = 70
//    pessoa.dataNascimento = LocalDate.of(2001, 9, 30)
//
//
//    val pessoa2 = Pessoa()
//    pessoa2.nome = "Kim Kardasha"  // Aqui você precisa usar pessoa2, não pessoa
//    pessoa2.altura = 1.69
//    pessoa2.peso = 60
//    pessoa2.dataNascimento = LocalDate.of(1999, 2, 14)
//
//    pessoa.exibirDados()
//    pessoa2.exibirDados()
//

//    Nome: Michael Jackson
//    Peso: 70
//    Altura: 1.8
//    Data Nasc: 2001-09-30
//    -----------------------
//    Nome: Kim Kardasha
//    Peso: 60
//    Altura: 1.69
//    Data Nasc: 1999-02-14
//    -----------------------


//    Nome: Michael Jackson
//    Peso: 70
//    Altura: 1.8
//    Data Nasc: 2001-09-30
//    Idade: 22
//    -----------------------
//    Nome: Kim Kardasha
//    Peso: 60
//    Altura: 1.69
//    Data Nasc: 1999-02-14
//    Idade: 25
//    -----------------------

}

