# Aula de Kotlin: Classes

## Descrição

Nesta aula, exploramos o conceito de **classes** em Kotlin. A classe `Pessoa` foi utilizada para modelar atributos e comportamentos de uma pessoa, como nome, altura, peso, e data de nascimento. Aprendemos a criar instâncias de uma classe e a manipular seus atributos.

## Código Exemplo

```kotlin
import model.Pessoa
import java.time.LocalDate

fun main() {

    val pessoa = Pessoa()
    pessoa.nome = "Michael Jackson"
    pessoa.altura = 1.80
    pessoa.peso = 70
    pessoa.dataNascimento = LocalDate.of(2001, 9, 30)

    val pessoa2 = Pessoa()
    pessoa2.nome = "Kim Kardasha"
    pessoa2.altura = 1.69
    pessoa2.peso = 60
    pessoa2.dataNascimento = LocalDate.of(1999, 2, 14)

    pessoa.exibirDados()
    pessoa2.exibirDados()
}
```

## Funcionalidades da Classe `Pessoa`

A classe `Pessoa` possui os seguintes atributos:

- `nome`: O nome da pessoa (tipo `String`).
- `altura`: A altura da pessoa (tipo `Double`).
- `peso`: O peso da pessoa (tipo `Int`).
- `dataNascimento`: A data de nascimento da pessoa (tipo `LocalDate`).

A classe também possui um método `exibirDados()` que imprime no console as informações da pessoa formatadas da seguinte forma:

```yaml
Nome: [Nome]
Peso: [Peso]
Altura: [Altura]
Data Nasc: [Data de Nascimento]
-----------------------
```

## Saída Esperada

Ao executar o código, a saída no console será:

```yaml
Nome: Michael Jackson
Peso: 70
Altura: 1.8
Data Nasc: 2001-09-30
-----------------------
Nome: Kim Kardasha
Peso: 60
Altura: 1.69
Data Nasc: 1999-02-14
-----------------------

```

## Descrição

Nesta aula, exploramos como criar uma classe em Kotlin e como definir propriedades e métodos dentro dela. A classe `Pessoa` foi utilizada para representar uma pessoa com atributos como nome, data de nascimento, peso, e altura. Também foi abordado o cálculo da idade da pessoa com base em sua data de nascimento.

## Código da Classe `Pessoa`

```kotlin
package model

import java.time.LocalDate
import java.time.Period

class Pessoa {

    // Propriedades/Campos/Atributos do objeto
    var nome: String = ""
    var dataNascimento: LocalDate = LocalDate.of(2000, 6, 30)
    var peso: Int = 0
    var altura: Double = 0.0

    // Propriedade calculada para determinar a idade
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

    ```

//    fun calcularIdade(): Int{
//        var idade = Period.between(dataNascimento, LocalDate.now()).years
//        return idade
//    }
}
```
## Funcionalidades da Classe `Pessoa`

A classe `Pessoa` possui os seguintes atributos:

- `nome`: O nome da pessoa (tipo `String`).
- `dataNascimento`: A data de nascimento da pessoa (tipo `LocalDate`).
- `peso`: O peso da pessoa (tipo `Int`).
- `altura`: A altura da pessoa (tipo `Double`).

### Propriedade Calculada

- `idade`: Uma propriedade calculada que retorna a idade da pessoa com base na data de nascimento. A idade é calculada utilizando a função `Period.between()` que compara a data de nascimento com a data atual.

### Método `exibirDados()`

A classe também possui um método `exibirDados()` que imprime no console as informações da pessoa formatadas da seguinte forma:

```yaml
Nome: [Nome]
Peso: [Peso]
Altura: [Altura]
Data Nasc: [Data de Nascimento]
Idade: [Idade]
-----------------------

Nome: Michael Jackson
Peso: 70
Altura: 1.8
Data Nasc: 2001-09-30
Idade: 22
-----------------------
Nome: Kim Kardasha
Peso: 60
Altura: 1.69
Data Nasc: 1999-02-14
Idade: 25
-----------------------
