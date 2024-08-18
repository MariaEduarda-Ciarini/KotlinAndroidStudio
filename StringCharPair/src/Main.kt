// 4 - Aula sobre String, Char e Pair


fun main() {
    val cityofgod: String = "Rio de Janeiro"
    println("Nome da cidade $cityofgod")
    println("Quantidades de letras: ${cityofgod.length}")

    var (codigo, descricao) = Pair(85, "Mouse")
    println(codigo)
    println(descricao)

    val produto2: Pair<Int, String> = Pair(175, "Teclado")
    println(produto2.first)
    println(produto2.second)
}
