
fun main() {
    infix fun Int.pow(number: Int) = Math.pow(this.toDouble(), number.toDouble())

    println(2 pow 2)

    fun messages(vararg messages: String) { for (m in messages) print("$m ") }

    messages("Eduardo", "Henrique", "Lima", "Silva")

    val name = "Eduardo"

    val toUpperCase: (String) -> String = {it.uppercase()}

    println("Hello World! $name")
    println("Hello World! ${toUpperCase(name)}")

    println(toUpperCase("Eduardo"))

    println(calculo(1, 1, ::sum))
    println(calculo(5, 5) { x, y -> x * y })
    println(sub(10, 4))

}

fun calculo(x: Int, y: Int, op: (Int, Int) -> Int): Int = op(x, y)

fun sum(x: Int, y: Int) = x + y

val sub: (Int, Int) -> Int = {x: Int, y: Int -> x - y}