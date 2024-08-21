# Estudo sobre Condições e Enumerações em Kotlin

Este repositório contém exemplos e explicações sobre o uso de condições (`if`, `else`, `when`) e enumerações (`enum class`) em Kotlin.

## Código de Exemplo

### Controle de Fluxo com `if` e `else`

Este exemplo demonstra o uso de condições básicas em Kotlin para verificar se um número é par ou ímpar, e para categorizar a temperatura:

```kotlin
fun main() {
    var number = 11
    if (number % 2 == 0) {
        println("Ele é par")
    } else {
        println("Ele é ímpar")
    }
    
    var temperature = 18
    var climate = ""
    if (temperature <= 0) {
        climate = "Muito frio"
    } else if (temperature < 14) {
        climate = "Frio"
    } else if (temperature < 21) {
        climate = "Clima agradável"
    } else if (temperature < 30) {
        climate = "Um pouco quente"
    } else {
        climate = "Muuuito quente"
    }
    println("Temperatura: $temperature graus Status: $climate")
}
```

## Uso de `enum class` em Kotlin

Aqui, definimos uma enumeração para representar as direções de uma bússola e realizamos um controle de fluxo usando `when` para determinar a direção.

```kotlin
enum class Compass {
    north,
    east,
    west,
    south
}

fun main(args: Array<String>) {
    var direction = Compass.north
    println("Minha direção é $direction")

    when (direction) {
        Compass.north -> println("Estamos indo para o norte")
        Compass.south -> println("Estamos indo para o sul")
        Compass.east -> println("Estamos indo para o leste")
        Compass.west -> println("Estamos indo para o oeste")
    }

    Compass.values().forEach {
        println(it)
    }
}
```

## Enumeração com Valores Padrão

Neste exemplo, atribuímos valores padrão a enumerações, como a posição de assentos em um avião e os meses do ano.

```kotlin
enum class SeatPosition(var seat: String) {
    aisle("corredor"),
    middle("meio"),
    window("janela")
}

enum class Month(var m: Int) {
    january(1), february(2), march(3), april(4), may(5), june(6),
    july(7), august(8), september(9), october(10), november(11), december(12)
}

fun main(args: Array<String>) {
    var passengerSeat = SeatPosition.window
    println(passengerSeat.seat)   // janela

    var currentMonth: Month = Month.june
    println("Estamos no mês ${currentMonth.m} do ano")
}
```

## Conceitos Aprendidos

- **Controle de Fluxo:** Uso de `if`, `else`, `when` para tomar decisões no código.
- **Enumerações (`enum class`):** Como definir constantes em Kotlin, associar valores padrão e utilizar em estruturas condicionais.
- **Iteração sobre Enumerações:** Uso de `forEach` para iterar sobre os valores de um enum.

## Conclusão

Estes exemplos ajudam a entender o uso de condições e enumerações em Kotlin, proporcionando uma base sólida para escrever códigos mais organizados e legíveis.
