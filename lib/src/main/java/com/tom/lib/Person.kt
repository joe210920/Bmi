package com.tom.lib

class Person {
    var weight: Float = 0f
    var height: Float = 0f

    fun sayHello() {
        println("Hello")
    }

    fun getBmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }
}

fun main() {
    val people = Person()
    people.weight = 65f
    people.height = 1.7f
    print("You BMI is ${people.getBmi()}")

}

