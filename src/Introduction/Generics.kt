package Introduction

import kotlin.reflect.typeOf

class QualquerTipo<T>(value: T) {
    init {
        println(value)
    }
}

fun main() {
    val classe = QualquerTipo("Eduardo")

    val classe2 = QualquerTipo(6)


}