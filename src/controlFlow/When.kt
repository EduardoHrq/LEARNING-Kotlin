package controlFlow

fun main() {

    case(5)

}

fun case(value: Any) {
    when (value) {
        in 1..10 -> println("one")
        is Int -> println("numero")
        else -> println("unknown")
    }
}