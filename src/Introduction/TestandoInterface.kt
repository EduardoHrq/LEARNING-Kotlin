package Introduction

sealed interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}

data class Employee(
    // implementing 'name' is not required
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person

fun main() {
    val employee = Employee("eduardo", "silva", "dev").also(::println)

    println(employee.name)
}