//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var citys = arrayOf<String>("São Paulo", "Rio de Janeiro", "Parana")
    println(citys[0])

    println(citys[1])

    // Alterando posição do indice
    citys[1] = "Vitória"

    println(citys[1])

    val havecitys = citys.isEmpty()
    println(havecitys)

    println(citys.size)


}