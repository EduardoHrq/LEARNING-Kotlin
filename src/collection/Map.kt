package collection

val mapDeUser: MutableMap<Int, String> = mutableMapOf(1 to "Eduardo", 2 to "Joao")
val maped: Map<Int, String> = mapDeUser

fun main() {

    println(mapDeUser)
    println(mapDeUser[1])
    println(mapDeUser.getValue(1))

    maped.forEach { println(it) }
    maped.forEach { k, v -> println("key $k -> value $v") }
    maped.forEach { _, v -> println(v) } // _ (underscore) para quando não quer usar o parametro

}