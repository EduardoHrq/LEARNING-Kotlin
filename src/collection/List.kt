package collection

fun main() {

    val listaMutavelUsuarios: MutableList<String> = mutableListOf("Eduardo", "Joao")
    val listaUser: List<String> = listaMutavelUsuarios

    println(listaUser)

    listaMutavelUsuarios.add("malu")

    println(listaUser)

    listaUser.forEach { str -> println(str) }

    listaUser.forEach { println(it) }

}