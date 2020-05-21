package com.excercise.designpatterns.oop.inheritance

class Cat: Animal() {
    override fun breath() {
        println("cat breathes using oxygen")
    }

    override fun run() {
        println("cat runs using four legs. It moves fast")
    }

    override fun walk() {
        println("cat runs using four legs. It moves slowly")
    }

    override fun makeSound() {
        println("meow!")
    }
}