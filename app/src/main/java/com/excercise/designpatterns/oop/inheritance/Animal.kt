package com.excercise.designpatterns.oop.inheritance

// abstract class to model object (blueprint) of general type
abstract class Animal: Breath, Move {
    // makeSound() set to abstract in order to ensure child classes override the right makeSound()
    abstract fun makeSound()
}