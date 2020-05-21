package com.excercise.designpatterns.creational.factorymethod

class Ship: Transport{
    override fun deliver() {
        println("deliver cargo by sea")
    }
}