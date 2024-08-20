# Estudos sobre Kotlin: Coleções - Array e List

Este repositório contém um exemplo prático de código em Kotlin, abordando o uso de coleções como `Array` e `List`. Este estudo faz parte da seção de Coleções em Kotlin.

## Exemplo de Código: Trabalhando com `Array`

```kotlin
fun main() {
    var citys = arrayOf<String>("São Paulo", "Rio de Janeiro", "Parana")
    
    // Acessando elementos do array
    println(citys[0]) // Imprime: São Paulo
    println(citys[1]) // Imprime: Rio de Janeiro

    // Alterando o valor de um elemento no array
    citys[1] = "Vitória"
    println(citys[1]) // Imprime: Vitória

    // Verificando se o array está vazio
    val havecitys = citys.isEmpty()
    println(havecitys) // Imprime: false

    // Obtendo o tamanho do array
    println(citys.size) // Imprime: 3
}
```

Explicação do Código
Criação do Array:

A variável citys é inicializada com um array de Strings, contendo as cidades "São Paulo", "Rio de Janeiro" e "Parana".

Acessando Elementos:

Utilizando println(citys[0]) e println(citys[1]), os elementos do array são acessados e impressos. Os índices começam em 0.

Modificação de Elementos:

O código citys[1] = "Vitória" altera o segundo elemento do array de "Rio de Janeiro" para "Vitória".
Verificando se o Array Está Vazio:

A função isEmpty() verifica se o array está vazio. No exemplo, havecitys armazena o resultado, que é false porque o array contém elementos.

Tamanho do Array:

O método size retorna o número de elementos no array, que neste caso é 3.

Este exemplo básico ilustra como trabalhar com arrays em Kotlin, desde a criação até a manipulação de seus elementos. Arrays são uma estrutura fundamental para armazenar e manipular coleções de dados de maneira eficiente. Em estudos futuros, é importante explorar outras coleções, como List, Set e Map, para entender suas características e usos em diferentes contextos de programação.