# Aula de Classes e Herança em Kotlin

Este repositório contém o código desenvolvido durante a aula sobre **Classes e Herança** em Kotlin. O objetivo foi entender e implementar conceitos de classes, herança e sobrecarga de métodos, utilizando exemplos práticos.

## Código Explicado

Neste exemplo, temos duas classes principais: `Pessoa` e `Funcionario`, onde `Funcionario` herda de `Pessoa`.

### Classe `Pessoa`

A classe `Pessoa` é a classe base e contém propriedades e métodos básicos. Abaixo estão os detalhes da classe:

- **`nome`**: `String` - Armazena o nome da pessoa.
- **`peso`**: `Double` - Armazena o peso da pessoa.
- **`altura`**: `Double` - Armazena a altura da pessoa.
- **`dataNascimento`**: `LocalDate` - Armazena a data de nascimento da pessoa.
- **`idade`**: `Int` - Calcula a idade da pessoa com base na data de nascimento.
- **`exibirDados()`**: Método para exibir os dados da pessoa no console.

Aqui está o código da classe `Pessoa`:

```kotlin
package model

import java.time.LocalDate
import java.time.Period

open class Pessoa {

    // Propriedades/campo/atributo do objeto
    var nome: String = ""
    var dataNascimento: LocalDate = LocalDate.of(2000, 6, 30)
    var peso: Double = 0.0
    var altura: Double = 0.0

    val idade: Int
        get() {
            return Period.between(dataNascimento, LocalDate.now()).years
        }

    // Métodos / Comportamento
    open fun exibirDados() {
        println("Nome: $nome")
        println("Peso: $peso")
        println("Altura: $altura")
        println("Data Nasc: $dataNascimento")
        println("Idade: ${idade}")
        println("-----------------------")
    }
}
```
# Classe `Funcionario`

A classe `Funcionario` é uma extensão da classe `Pessoa` e adiciona propriedades e comportamentos específicos para representar um funcionário. 

## Propriedades da Classe `Funcionario`

- **`cargo`**: `String` - Armazena o cargo do funcionário.
- **`salario`**: `Double` - Armazena o salário do funcionário.

## Sobrescrita do Método `exibirDados()`

A classe `Funcionario` sobrescreve o método `exibirDados()` da classe `Pessoa` para incluir a exibição das novas propriedades `cargo` e `salario`, além das propriedades herdadas.

Aqui está o código da classe `Funcionario`:

```kotlin
package model

class Funcionario : Pessoa() {

    var cargo: String = ""
    var salario: Double = 0.0

    override fun exibirDados() {
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
```
# Saida no console
```Nome: Maria
Peso: 100.0
Altura: 0.0
Data Nasc: 2000-06-30
Idade: 24
-----------------------
Nome: Bruce Wayne
Peso: 95.0
Altura: 1.9
Data Nasc: 2000-06-30
Idade: 24
Cargo: Desenvolvedor Full Stack
Salario:  25000.0
-----------------------
```

## Herança em Kotlin (Código Explicado)

#### Classe `Pessoa`

A classe `Pessoa` é a classe base e contém propriedades e métodos básicos. Ela é definida com o modificador `open`, o que permite que outras classes a herdem. Abaixo estão os detalhes da classe:

### Propriedades da Classe `Pessoa`

- **`nome`**: `String` - Armazena o nome da pessoa.
- **`dataNascimento`**: `LocalDate` - Armazena a data de nascimento da pessoa.
- **`peso`**: `Int` - Armazena o peso da pessoa.
- **`altura`**: `Double` - Armazena a altura da pessoa.

### Propriedade Calculada

- **`idade`**: `Int` - Calcula a idade da pessoa com base na data de nascimento, utilizando a diferença em anos entre a data de nascimento e a data atual.

### Métodos da Classe `Pessoa`

- **`exibirDados()`**: Método `open` que exibe os dados da pessoa no console. O modificador `open` permite que este método seja sobrescrito por classes que herdam de `Pessoa`.

Aqui está o código da classe `Pessoa`:

```kotlin
package model

import java.time.LocalDate
import java.time.Period

open class Pessoa {

    // Propriedades/campo/atributo do objeto
    var nome: String = ""
    var dataNascimento: LocalDate = LocalDate.of(2000, 6, 30)
    var peso: Int = 0
    var altura: Double = 0.0

    val idade: Int
        get() {
            return Period.between(dataNascimento, LocalDate.now()).years
        }

    // Métodos / Comportamento
    open fun exibirDados() {
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
//    }
}
