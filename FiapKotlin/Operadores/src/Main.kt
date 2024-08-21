//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var a = 12
    var b = 3
    var sum = a + b             //15
    var subtract = a - b        //9
    var multiplication = a * b  //36
    var division = a / b        //4
    var módulus = a % b         //Resto da divisão: 0
    var minusA = -a             //-12

    var a = 2
    var b = 3
    var newValue = 5

    newValue += a   //7
    newValue -= b   //4
    newValue *= a   //8
    newValue /= a   //4
    newValue %= b   //Resto da divisão: 1

    newValue++ //incrementando 1
    println(newValue)

    newValue-- //decrementando 1
    println(newValue)


    var yes = true
    var no = false
    println(yes &amp;&amp; no)   //false
    println(yes || no)   //true
    println(!yes)        //false

    var a = 12
    var b = 3
    var c = 7
    var d = 3
    println(a > b)   //true
    println(a < b)   //false
    println(b >= d)  //true
    println(a <= c)  //false
    println(b == d)  //true
    println(b != d)  //false

    var grade = 7.5
    var result = if (grade > 7.0) "aprovado" else "reprovado"
    println(result)   //aprovado

    var age: Int? = null
    var myAge = age ?: 0    //0
    println(myAge)

    age = 25
    var newAge = age ?: 0   //25
    println(newAge)

    println("\nClosed Range ..")
    var numbers = 1..10
    for (number in numbers) {
        println(number)   //Imprime de 1 a 10
    }

    println("\nHalf Closed Range (until)")
    var newNumbers = (1 until 10)
    for (number in newNumbers) {
        println(number)   //Imprime de 1 a 9
    }
}
