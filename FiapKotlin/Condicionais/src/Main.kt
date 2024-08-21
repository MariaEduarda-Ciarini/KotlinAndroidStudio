//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
    println("Temperatura:$temperature graus Status:$climate")

}

// Enumerados

//Definindo um enum fora da função main
enum class Compass {
    north,
    east,
    west,
    south
}

fun main(args: Array<String>) {
    //Criando uma variável do tipo Compass

    var direction = Compass.north

    //Como Kotlin trabalha com inferência de tipo, podemos usar
    // somente .valor, caso o tipo seja definido explicitamente

    var direction2: Compass = Compass.south
    println("Minha direção é $direction")

    //Minha direção é north
    //Enums são muito usados com switch para análise do valor

    when (direction) {
        Compass.north ->
            println("Estamos indo para o norte")

        Compass.south ->
            println("Estamos indo para o sul")

        Compass.east ->
            println("Estamos indo para o leste")

        Compass.west ->
            println("Estamos indo para o oeste")
    }

    //Estamos indo para o norte


    //Outra forma de apresentar informações de um Enum

    Compass.values().forEach {
        println(it)
    }
}

//Enum que define as posições das poltronas em um avião
//Veja que é possível atribuir um valor padrão a cada uma delas
enum class SeatPosition(var seat: String) {
    aisle("corredor"),
    middle("meio"),
    window("janela")
}

//Enum de Int com valores padrões
enum class Month(var m: Int) {
    january(1), february(2), march(3), april(4), may(5), june(6),
    july(7), august(8), september(9), october(10), november(11), december(12)
}

fun main(args: Array<String>) {
    var passengerSeat = SeatPosition.window
    //Para imprimir o valor padrão, usamos o nome utilizado na construção do enum. Veja:
    println(passengerSeat.seat)   //janela
    var currentMonth: Month = Month.june
    println("Estamos no mês ${currentMonth.m} do ano")
}
