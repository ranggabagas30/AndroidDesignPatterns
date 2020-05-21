package com.excercise.designpatterns.oop.inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.excercise.designpatterns.R

class InheritanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inheritance)

        val cat = Cat()
        cat.breath()
        cat.run()
        cat.walk()
        cat.makeSound()

        val dog = Dog()
        dog.breath()
        dog.run()
        dog.walk()
        dog.makeSound()

        println("taking random animal from bag; ")
        val bag = arrayListOf(
            Cat(),
            Dog()
        )

        for (animal in bag) {
            animal.makeSound() // call make sound on every animal instance
        }

        val bagBreath = arrayListOf<Breath>(
            CatBreath(),
            DogBreath()
        )

        println("taking random animal breath")
        for (animalBreath in bagBreath) {
            animalBreath.breath()
        }
    }
}
