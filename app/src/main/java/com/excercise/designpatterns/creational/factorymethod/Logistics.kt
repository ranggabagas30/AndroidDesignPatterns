package com.excercise.designpatterns.creational.factorymethod

abstract class Logistics {
    abstract fun planDelivery()
    abstract fun createTransport(): Transport // factory method declared as abstract to enforce subclasses define their own product implementation
    open fun createTransportDefault(): Transport{ // factory method defined on base class as the default product
        return LogisticVehicle()
    }
}