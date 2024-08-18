# Aula sobre String, Char e Pair em Kotlin

## Objetivo

Nesta aula, exploramos como trabalhar com os tipos `String`, `Char` e a estrutura `Pair` em Kotlin. Esses conceitos são fundamentais para manipular texto e dados agrupados de maneira eficiente.

## Conteúdo Abordado

### Strings (`String`)

- Em Kotlin, `String` representa uma sequência de caracteres.
- Você pode acessar propriedades e métodos de `String`, como `length`, para obter o tamanho da string.

### Caracteres (`Char`)

- Embora `Char` não seja diretamente utilizado neste exemplo, ele representa um único caractere em Kotlin.
- Um `Char` é delimitado por aspas simples (`'a'`), enquanto uma `String` é delimitada por aspas duplas (`"texto"`).

### Pares (`Pair`)

- `Pair` é uma estrutura de dados que armazena dois valores, que podem ser de tipos diferentes.
- Você pode acessar os elementos de um `Pair` utilizando `first` e `second` ou desestruturando o par diretamente em variáveis.

## Exemplo de Código

O código a seguir ilustra como trabalhar com `String` e `Pair` em Kotlin:

```kotlin
fun main() {
    // Declarando uma String
    val cityofgod: String = "Rio de Janeiro"
    println("Nome da cidade: $cityofgod")
    
    // Obtendo o comprimento da String
    println("Quantidade de letras: ${cityofgod.length}")

    // Desestruturando um Pair em duas variáveis
    var (codigo, descricao) = Pair(85, "Mouse")
    println(codigo)
    println(descricao)

    // Criando um Pair e acessando seus elementos com 'first' e 'second'
    val produto2: Pair<Int, String> = Pair(175, "Teclado")
    println(produto2.first)
    println(produto2.second)
}

Explicação:
val cityofgod: String = "Rio de Janeiro": Declara uma constante cityofgod do tipo String com o valor "Rio de Janeiro".

println("Nome da cidade: $cityofgod"): Exibe o nome da cidade utilizando interpolação de strings.

println("Quantidade de letras: ${cityofgod.length}"): Exibe o número de caracteres da string cityofgod utilizando a propriedade length.

var (codigo, descricao) = Pair(85, "Mouse"): Cria um Pair contendo um código (85) e uma descrição ("Mouse"), desestruturando-o em duas variáveis (codigo e descricao).

val produto2: Pair<Int, String> = Pair(175, "Teclado"): Cria um Pair chamado produto2, que armazena um código (175) e uma descrição ("Teclado").
println(produto2.first) e println(produto2.second): 
Exibem os valores armazenados no Pair produto2 utilizando first e second.

Considerações Finais
Dominar o uso de String e Pair é crucial para manipular dados textuais e estruturas de dados simples em Kotlin. A capacidade de desestruturar Pair em variáveis individuais torna o código mais legível e eficiente.