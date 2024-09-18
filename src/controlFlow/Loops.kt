package controlFlow

fun main(){

    val cars = listOf("mustang", "208", "cruze")

    for (car in cars) {
        println(car)
    }

    //ranges
//
//    for (i in 0..1000) {
//        print(" $i ")
//    }

//    for (i in 0 until 10) print(" $i ")

    for (i in 0..10 step 2) print(" $i ")

    for (c in 'a'..'z') print(" $c ")
}