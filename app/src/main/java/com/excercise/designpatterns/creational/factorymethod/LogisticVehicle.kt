package com.excercise.designpatterns.creational.factorymethod

class LogisticVehicle: Transport {
    override fun deliver() {
        println("deliver cargo")
    }
}