fun main() {
    // Criando e manipulando um Set de Strings
    var series = HashSet<String>()
    println(series.size) // Imprime 0

    // Adições
    series.add("Emilly In Paris")
    series.add("JoJo Bizarro")
    series.add("Breaking Bad")

    println(series.size) // Imprime 3
    println(series)

    series.add("Emilly In Paris")
    println(series)

    series.add("Emilly In Paris PT2")
    println(series)

    println(series.contains("Breaking Bad"))

    series.remove("Emilly In Paris PT2")
    println(series)

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
    println("\n")

    // Criando um set vazio
    var movies2 = HashSet<String>()

    // Inserindo elementos
    movies.add("Homem-Aranha: De Volta ao Lar")
    println(movies) // [Homem-Aranha: De Volta ao Lar, Jurassic Park, Matrix, De Volta para o Futuro, Vingadores]
    println(movies.count()) // 5
    println("\n")

    // O código abaixo NÃO alterará a quantidade de itens do Set
    movies.add("Homem-Aranha: De Volta ao Lar")
    println(movies) // [Homem-Aranha: De Volta ao Lar, Jurassic Park, Matrix, De Volta para o Futuro, Vingadores]
    println(movies.count()) // 5 (Nenhum elemento repetido. E ainda tudo ordenado)
    println("\n")

    // Removendo elemento
    movies.remove("Homem-Aranha: De Volta ao Lar")
    println(movies) // [Vingadores, De Volta para o Futuro, Matrix, Jurassic Park]
    println(movies.count()) // 4
    println("\n")

    // Percorrendo um Set
    for (movie in movies) {
        println(movie)
    }
    println("\n")

    // Verificando se determinado elemento está contido no List
    if (movies.contains("Matrix")) {
        println("Matrix está na minha lista de filmes favoritos!!")
    }
    println("\n")

    // Criando um novo set para realizar operações
    var myWifeMovies = setOf(
        "De Repente 30",
        "Mensagem para você",
        "Sintonia de Amor",
        "De Volta para o Futuro",
        "Jurassic Park"
    )

    // Criando um Set com todos os filmes. SEM repetição. TUDO ordenado ;)
    var allMovies = movies + myWifeMovies
    println(allMovies) // [Jurassic Park, Matrix, De Volta para o Futuro, Vingadores, De Repente 30, Mensagem para você, Sintonia de Amor]
    println(allMovies.count()) // 7
    println("\n")

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
    println("\n")

    // Criando um set vazio
    var movies2Map = HashSet<String>()

    // Inserindo 1 elemento
    moviesMap.put(25, "Homem-Aranha: De Volta ao Lar")
    println(moviesMap) // {40=De Volta para o Futuro, 25=Homem-Aranha: De Volta ao Lar, 10=Matrix, 20=Vingadores, 30=Jurassic Park}
    println(moviesMap.count()) // 5
    println("\n")

    // O código abaixo irá alterar a quantidade de itens do Map
    moviesMap.put(35, "Homem-Aranha: De Volta ao Lar")
    println(moviesMap) // {40=De Volta para o Futuro, 25=Homem-Aranha: De Volta ao Lar, 10=Matrix, 35=Homem-Aranha: De Volta ao Lar, 20=Vingadores, 30=Jurassic Park}
    println(moviesMap.count()) // 6
    println("\n")

    // Removendo elemento
    moviesMap.remove(25)
    println(moviesMap) // {40=De Volta para o Futuro, 10=Matrix, 35=Homem-Aranha: De Volta ao Lar, 20=Vingadores, 30=Jurassic Park}
    println(moviesMap.count()) // 5
    println("\n")

    // Percorrendo um Map
    for (movie in moviesMap) {
        println(movie)
    }
    println("\n")

    // Verificando se determinado elemento está contido no Map
    if (moviesMap.containsValue("Matrix")) {
        println("Matrix está na minha lista de filmes favoritos!!")
    }
    println("\n")

    // Criando um novo map para realizar operações
    var myWifeMoviesMap = mapOf(
        Pair(100, "De Repente 30"),
        Pair(200, "Mensagem para você"),
        Pair(300, "Sintonia de Amor"),
        Pair(400, "De Volta para o Futuro"),
        Pair(500, "Jurassic Park")
    )

    // Criando um Map com todos os filmes
    var allMoviesMap = moviesMap + myWifeMoviesMap
    println(allMoviesMap) // {40=De Volta para o Futuro, 10=Matrix, 35=Homem-Aranha: De Volta ao Lar, 20=Vingadores, 30=Jurassic Park, 100=De Repente 30, 200=Mensagem para você, 300=Sintonia de Amor, 400=De Volta para o Futuro, 500=Jurassic Park}
    println(allMoviesMap.count()) // 10
    println("\n")

    // Lendo Chave e Valor separadamente
    for (movie in allMoviesMap) {
        println("Chave => Key => ${movie.key}")
        println("Valor => Value => ${movie.value}")
        var title = movie.value.toUpperCase()
        println("UpperCase => ${title}")
        title = movie.value.toLowerCase()
        println("LowerCase => ${title}")
        println("\n")
    }

    // Executando uma pesquisa diretamente na chave do Map
    var film1 = allMoviesMap.get(400) // 400=De Volta para o Futuro
    println("Title => ${film1}") // Retorna String. Retorna o Título
    var film2 = allMoviesMap.get(999) // Não existe
    println("Title => ${film2}") // Retorna null

    // Verificando a possibilidade de testar antes de imprimir
    var code = 1234 // Experimente trocar o código
    var film3 = allMoviesMap.get(code) // Não existe
    if (film3.isNullOrEmpty()) {
        println("\nFilme com o código $code não encontrado!")
    } else {
        println("\nTitle => ${film3}") // Retorna o título
    }
}
