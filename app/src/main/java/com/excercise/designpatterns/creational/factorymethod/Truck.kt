package com.excercise.designpatterns.creational.factorymethod

class Truck: Transport{
    override fun deliver() {
        println("deliver cargo by land")
    }
}