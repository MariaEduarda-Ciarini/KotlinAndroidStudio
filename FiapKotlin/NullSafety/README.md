# Aula 5 - Null Safety em Kotlin

## Objetivo

Nesta aula, exploramos o conceito de **Null Safety** em Kotlin, que é uma das funcionalidades mais poderosas da linguagem para evitar exceções de referência nula, conhecidas como NullPointerException (NPE).

## Conteúdo Abordado

### O que é Null Safety?

- **Null Safety** é um recurso do Kotlin que ajuda a prevenir erros comuns relacionados a valores nulos.
- Em Kotlin, o compilador força o programador a lidar com `null` de forma explícita, garantindo que as variáveis sejam usadas de maneira segura.

### Declaração de Variáveis Nulas

- Para permitir que uma variável possa armazenar um valor nulo, é necessário adicionar o operador `?` ao tipo da variável.
- Exemplo: `var idade: Int? = null` declara uma variável `idade` do tipo `Int?`, que pode conter um valor inteiro ou `null`.

### Manipulação de Valores Nulos

- O Kotlin oferece diversas formas de lidar com valores nulos, como o operador de chamada segura (`?.`), o operador Elvis (`?:`), e a verificação de `null`.

## Exemplo de Código

O código a seguir ilustra o uso básico de Null Safety em Kotlin:

```kotlin
fun main() {
    // Declarando uma variável que pode ser nula
    var idade: Int? = null
    println(idade) // Exibe: null

    // Atribuindo um valor à variável
    idade = 20
    println(idade) // Exibe: 20
}

```
Explicação
var idade: Int? = null: Declara uma variável idade do tipo Int?, que pode ser nula.

println(idade): Exibe o valor atual da variável idade. No primeiro caso, como idade foi inicializada com null, null é impresso.

idade = 20: Atribui o valor 20 à variável idade.
println(idade): Após a atribuição de 20, a variável idade passa a conter esse valor e é exibido no console.