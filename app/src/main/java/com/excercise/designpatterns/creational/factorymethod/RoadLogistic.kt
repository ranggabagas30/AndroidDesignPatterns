package com.excercise.designpatterns.creational.factorymethod

class RoadLogistic: Logistics() {
    override fun planDelivery() {
        val truck = createTransport()
        truck.deliver()
    }

    override fun createTransport(): Transport {
        return Truck()
    }

    override fun createTransportDefault(): Transport {
        return Truck()
    }
}