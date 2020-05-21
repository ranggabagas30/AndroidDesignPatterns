package com.excercise.designpatterns.oop.inheritance

class Dog: Animal() {

    override fun breath() {
        println("breath using oxygen")
    }

    override fun run() {
        println("run using four legs fast")
    }

    override fun walk() {
        println("run using four legs slowly")
    }

    override fun makeSound() {
        println("bark")
    }
}