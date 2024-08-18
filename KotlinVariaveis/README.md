# Aula 3 - Variáveis, Constantes e Tipos em Kotlin

## Objetivo

Nesta aula, exploramos conceitos fundamentais sobre variáveis, constantes e tipos de dados na linguagem Kotlin. Compreender esses elementos é essencial para o desenvolvimento de aplicações robustas e eficientes.

## Conteúdo Abordado

### Variáveis (`var`)

- As variáveis em Kotlin são declaradas usando a palavra-chave `var`.
- Uma variável declarada com `var` pode ter seu valor alterado ao longo do programa.

### Constantes (`val`)

- As constantes são declaradas usando a palavra-chave `val`.
- Diferente das variáveis, uma constante não pode ter seu valor alterado após ser inicializada.

### Tipos de Dados

- Kotlin suporta uma ampla variedade de tipos de dados, incluindo números inteiros (`Byte`, `Int`), números de ponto flutuante (`Float`, `Double`), caracteres (`Char`), strings (`String`), entre outros.
- Cada tipo de dado tem um intervalo de valores que ele pode representar, como mostrado nos exemplos a seguir.

## Exemplo de Código

O código a seguir ilustra a declaração e uso de variáveis, constantes, e tipos de dados em Kotlin:

```kotlin
fun main() {
    // Declarando uma constante usando 'val'
    val name = "Kotlin"

    // Declarando uma variável usando 'var'
    var nomeFaculdade = "FIAP"
    
    // Alterando o valor da variável
    nomeFaculdade = "Faculdade de Informática e Administração Paulista"
    
    println("Aulas da $nomeFaculdade ensinando sobre Kotlin")
    println("Vai explodir meu notezinho esse, $name, !!!")

    // Declarando uma constante do tipo Byte
    val age: Byte = 20
    println("Fez $age")

    // Exibindo valores máximos e mínimos de tipos de dados
    println(Byte.MAX_VALUE) // 127
    println(Byte.MIN_VALUE) // -128
    println(Int.MAX_VALUE)  // 2147483647
    println(Int.MIN_VALUE)  // -2147483648
}

Explicação:
val name = "Kotlin": Declara uma constante name do tipo String. O valor "Kotlin" não pode ser alterado.

var nomeFaculdade = "FIAP": Declara uma variável nomeFaculdade do tipo String, cujo valor pode ser alterado posteriormente.
println(...): Exibe as mensagens no console. Aqui, é utilizado o recurso de interpolação de strings ($nomeFaculdade e $name).

val age: Byte = 20: Declara uma constante age do tipo Byte com o valor 20.
println(Byte.MAX_VALUE) e println(Byte.MIN_VALUE): Mostram os valores máximo e mínimo que uma variável do tipo Byte pode armazenar.
println(Int.MAX_VALUE) e println(Int.MIN_VALUE): Mostram os valores máximo e mínimo que uma variável do tipo Int pode armazenar.