package collection

val listUnique: MutableSet<String> = mutableSetOf("Eduardo", "Joao")

fun adicionar(value: String): Boolean {
    return listUnique.add(value)
}

fun getLog(status: Boolean): String {
    return if (status) "Adcionado" else "Já existe"
}

fun main() {


    println(listUnique.add("Eduardo")) // como já tem, nao adciona e retorna false

    println(listUnique.add("eduardo")) // case sensitive


    println(getLog(adicionar("Joao")))



}