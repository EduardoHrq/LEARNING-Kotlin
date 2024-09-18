package Introduction

open class Dog(name: String) {
    open fun sayHello() {
        println("wow wow")
    }
}

class Pitbul(name: String): Dog(name = name) {
    override fun sayHello() {
        println("holf holf")
    }
}

fun main() {
    val dog = Pitbul("cleverson")
}
