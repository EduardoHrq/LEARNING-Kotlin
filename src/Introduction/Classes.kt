package Introduction

class Customer() {
    private var nome: String = ""

    constructor(nome: String): this () {
        this.nome = nome
    }

    fun getNome(): String = this.nome
}

class Contact(val id: Int, var email: String)   // 2

fun main() {

    val customer = Customer()

    val customer2 = Customer("Eduardo")

    println(customer2.getNome())

    val contact = Contact(1, "mary@gmail.com")  // 4

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6
}