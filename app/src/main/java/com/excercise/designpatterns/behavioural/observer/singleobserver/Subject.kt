package com.excercise.designpatterns.behavioural.observer.singleobserver

import com.excercise.designpatterns.behavioural.observer.singleobserver.ISubject
import com.excercise.designpatterns.behavioural.observer.singleobserver.Observer

class Subject:
    ISubject {

    var observerList = ArrayList<Observer>()
    var _flag = 0
        set(value){
            field = value
            notifyObservers()
        }

    override fun register(o: Observer) {
        observerList.add(o)
    }

    override fun unregister(o: Observer) {
        observerList.remove(o)
    }

    override fun notifyObservers() {
        for (o in observerList)
            o.update()
    }
}