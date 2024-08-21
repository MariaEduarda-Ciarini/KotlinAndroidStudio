# Aula sobre Operadores em Kotlin

Este repositório contém um exemplo de código Kotlin abordando diferentes tipos de operadores, incluindo aritméticos, lógicos, de comparação, e outros operadores especiais.

## Conceitos Abordados

### 1. Operadores Aritméticos
- `+`: Soma
- `-`: Subtração
- `*`: Multiplicação
- `/`: Divisão
- `%`: Módulo (Resto da divisão)
- `-a`: Operador unário de negação

### 2. Operadores de Atribuição Composta
- `+=`: Incrementa o valor da variável
- `-=`: Decrementa o valor da variável
- `*=`: Multiplica e atribui o valor à variável
- `/=`: Divide e atribui o valor à variável
- `%=`: Calcula o módulo e atribui o valor à variável

### 3. Operadores de Incremento e Decremento
- `++`: Incrementa em 1
- `--`: Decrementa em 1

### 4. Operadores Lógicos
- `&&`: E lógico (AND)
- `||`: Ou lógico (OR)
- `!`: Não lógico (NOT)

### 5. Operadores de Comparação
- `>`: Maior que
- `<`: Menor que
- `>=`: Maior ou igual a
- `<=`: Menor ou igual a
- `==`: Igual a
- `!=`: Diferente de

### 6. Controle de Fluxo com `if`
- Exemplo de uso de `if` para verificar se uma nota é suficiente para aprovação.

### 7. Operador Elvis (`?:`)
- Uso do operador Elvis para atribuir um valor padrão caso a variável seja nula.

### 8. Intervalos (`Ranges`)
- `..`: Cria um intervalo fechado (inclui os extremos)
- `until`: Cria um intervalo semi-aberto (não inclui o valor final)

# Exemplo de Código Kotlin - Operadores

Este exemplo de código demonstra o uso de diversos operadores em Kotlin, como operadores aritméticos, operadores de atribuição, operadores lógicos, operadores de comparação, controle de fluxo com `if`, operador Elvis (`?:`), e intervalos (`Ranges`).

## Código

```kotlin
fun main() {

    // Operações Aritméticas Básicas
    var a = 12
    var b = 3
    var sum = a + b             // Soma: 15
    var subtract = a - b        // Subtração: 9
    var multiplication = a * b  // Multiplicação: 36
    var division = a / b        // Divisão: 4
    var módulus = a % b         // Resto da divisão: 0
    var minusA = -a             // Negativo de 'a': -12

    // Operadores de Atribuição Composta
    a = 2
    b = 3
    var newValue = 5

    newValue += a   // newValue = newValue + a (7)
    newValue -= b   // newValue = newValue - b (4)
    newValue *= a   // newValue = newValue * a (8)
    newValue /= a   // newValue = newValue / a (4)
    newValue %= b   // newValue = newValue % b (1)

    // Incremento e Decremento
    newValue++      // Incrementa newValue em 1 (2)
    println(newValue)

    newValue--      // Decrementa newValue em 1 (1)
    println(newValue)

    // Operadores Lógicos
    var yes = true
    var no = false
    println(yes && no)   // E lógico (false)
    println(yes || no)   // Ou lógico (true)
    println(!yes)        // Negação (false)

    // Operadores de Comparação
    a = 12
    b = 3
    var c = 7
    var d = 3
    println(a > b)   // Maior que (true)
    println(a < b)   // Menor que (false)
    println(b >= d)  // Maior ou igual (true)
    println(a <= c)  // Menor ou igual (false)
    println(b == d)  // Igual a (true)
    println(b != d)  // Diferente de (false)

    // Controle de Fluxo com if
    var grade = 7.5
    var result = if (grade > 7.0) "aprovado" else "reprovado"
    println(result)   // "aprovado"

    // Operador Elvis (?:)
    var age: Int? = null
    var myAge = age ?: 0    // Se age for nulo, myAge recebe 0
    println(myAge)

    age = 25
    var newAge = age ?: 0   // Se age não for nulo, newAge recebe 25
    println(newAge)

    // Intervalos (Ranges)
    println("\nClosed Range ..")
    var numbers = 1..10
    for (number in numbers) {
        println(number)   // Imprime de 1 a 10
    }

    println("\nHalf Closed Range (until)")
    var newNumbers = (1 until 10)
    for (number in newNumbers) {
        println(number)   // Imprime de 1 a 9
    }
}
