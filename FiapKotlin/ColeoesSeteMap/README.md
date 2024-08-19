# Aula sobre `Set` e `Map` em Kotlin

Nesta aula, exploramos o uso de `Set` e `Map` em Kotlin, abordando suas características, operações básicas e exemplos práticos. O objetivo é entender como trabalhar com coleções de dados de maneira eficiente.

## Sumário

1. [Introdução ao `Set`](#introdução-ao-set)
2. [Operações com `Set`](#operações-com-set)
   - [Adicionar Elementos](#adicionar-elementos)
   - [Remover Elementos](#remover-elementos)
   - [Verificar Contenção](#verificar-contencao)
   - [Iterar sobre o `Set`](#iterar-sobre-o-set)
3. [Introdução ao `Map`](#introdução-ao-map)
4. [Operações com `Map`](#operações-com-map)
   - [Adicionar/Atualizar Elementos](#adicionaratualizar-elementos)
   - [Remover Elementos](#remover-elementos-1)
   - [Verificar Contenção](#verificar-contencao-1)
   - [Iterar sobre o `Map`](#iterar-sobre-o-map)
5. [Exemplos de Código](#exemplos-de-código)

## Introdução ao `Set`

Um `Set` é uma coleção que não permite elementos duplicados. Em Kotlin, podemos usar `HashSet` para criar um `Set` que não mantém a ordem dos elementos.

## Operações com `Set`

### Adicionar Elementos

Utilize `add(element)` para adicionar elementos ao `Set`. Elementos duplicados não serão adicionados.

### Remover Elementos

Utilize `remove(element)` para remover elementos.

### Verificar Contenção

Utilize `contains(element)` para verificar se um elemento está presente no `Set`.

### Iterar sobre o `Set`

Utilize um loop `for` para percorrer os elementos.

### Exemplo de Código

```kotlin
// Criando um Set de Strings
var movies = HashSet<String>()
var catalog = listOf(
    "Matrix",
    "Vingadores",
    "Jurassic Park",
    "De Volta para o Futuro"
)

movies.addAll(catalog)
println(movies) // [Jurassic Park, Matrix, De Volta para o Futuro, Vingadores]
println(movies.count()) // 4

// Inserindo elementos
movies.add("Homem-Aranha: De Volta ao Lar")
println(movies) // [Homem-Aranha: De Volta ao Lar, Jurassic Park, Matrix, De Volta para o Futuro, Vingadores]
println(movies.count()) // 5

// Removendo elemento
movies.remove("Homem-Aranha: De Volta ao Lar")
println(movies) // [Vingadores, De Volta para o Futuro, Matrix, Jurassic Park]
println(movies.count()) // 4 

```
## 3. Introdução ao `Map`

Um `Map` é uma coleção de pares chave-valor, onde cada chave é única. Em Kotlin, podemos usar `HashMap` para criar um `Map` onde a ordem das entradas não é garantida.

## 4. Operações com `Map`

### Adicionar/Atualizar Elementos

Utilize `put(key, value)` para adicionar ou atualizar uma entrada.

### Remover Elementos

Utilize `remove(key)` para remover uma entrada.

### Verificar Contenção

Utilize `containsValue(value)` ou `containsKey(key)` para verificar se um valor ou chave está presente no `Map`.

### Iterar sobre o `Map`

Utilize um loop `for` para percorrer as entradas.

## 5. Exemplos de Código

```kotlin
// Criando um Map de Strings
var moviesMap = HashMap<Int, String>()
var catalogMap = mapOf(
    Pair(10, "Matrix"),
    Pair(20, "Vingadores"),
    Pair(30, "Jurassic Park"),
    Pair(40, "De Volta para o Futuro")
)

// Utilizando o método putAll para inserir o catálogo
moviesMap.putAll(catalogMap)
println(moviesMap) // {40=De Volta para o Futuro, 10=Matrix, 20=Vingadores, 30=Jurassic Park}
println(moviesMap.count()) // 4

// Criando um Map com todos os filmes
var myWifeMoviesMap = mapOf(
    Pair(100, "De Repente 30"),
    Pair(200, "Mensagem para você"),
    Pair(300, "Sintonia de Amor"),
    Pair(400, "De Volta para o Futuro"),
    Pair(500, "Jurassic Park")
)


var allMoviesMap = moviesMap + myWifeMoviesMap
println(allMoviesMap) // {40=De Volta para o Futuro, 10=Matrix, 35=Homem-Aranha: De Volta ao Lar, 20=Vingadores, 30=Jurassic Park, 100=De Repente 30, 200=Mensagem para você, 300=Sintonia de Amor, 400=De Volta para o Futuro, 500=Jurassic Park}
println(allMoviesMap.count()) // 10


