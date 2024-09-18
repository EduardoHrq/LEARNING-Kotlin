package collection

fun main() {

    val number = listOf(1, -2, 3, 4, 5, 10, -20, -100)

    val positivos = number.filter { x -> x > 0 } //predicate
    val negativos = number.filter { x -> x < 0 }

    println("positivos: $positivos \nnegativos: $negativos")

    val doubled = number.map { x -> x * 2 } //nova lista
//    val doubled = number.map { it * 2 } //nova lista

    println("\nnumber: $number \ndoubled: $doubled")

//    any, all e none retornam boolean

    val temNumPar = number.any() { it % 2 == 0 } // predicate
    val todosSaoPar = number.all { it % 2 == 0 } // predicate
    val temNumMaior = number.none { it < 20 } // predicate

    println("\ntodos sao pares: $temNumPar")
    println("todos sao pares: $todosSaoPar")
    println("todos sao pares: $temNumMaior")

//    find, findLast tambem recebem predicate, mas retornam o valor

//    fist e last recebem predicate e retornam o primeiro e o ultimo valor encontrado, respectivamente
//    tem uma variação para null-safety firstOrNull e lastOrNull

//        count recebe um predicate

    println("\n${number.count()}")
    println("${number.count { it % 2 == 0 }}")

//    getOrElse, como parametro o index e entre parenteses o valor retornado caso não encontre

    println(number.getOrElse(20) {500})

}