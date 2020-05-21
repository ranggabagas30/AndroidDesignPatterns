package com.excercise.designpatterns.behavioural.observer.multiobserver

class Subject1: ISubject1 {

    var observersList = ArrayList<IObserver>()
    var myValue = 0
        set(value) {
            field = value
            notifyObservers(field)
        }

    override fun register(iObserver: IObserver) {
        observersList.add(iObserver)
    }

    override fun unregister(iObserver: IObserver) {
        observersList.remove(iObserver)
    }

    override fun notifyObservers(value: Int) {
        for (iObserver in observersList)
            iObserver.update(value)
    }
}