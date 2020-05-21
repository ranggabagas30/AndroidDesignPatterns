package com.excercise.designpatterns.creational.factorymethod

class SeaLogistic: Logistics() {
    override fun planDelivery() {
        val ship = createTransport()
        ship.deliver()
    }

    override fun createTransport(): Transport {
        return Ship()
    }

    override fun createTransportDefault(): Transport {
        return Ship()
    }
}