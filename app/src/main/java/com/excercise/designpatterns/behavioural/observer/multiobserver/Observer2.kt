package com.excercise.designpatterns.behavioural.observer.multiobserver

import com.excercise.designpatterns.behavioural.observer.multiobserver.IObserver

class Observer2:
    IObserver {
    override fun update(value: Int) {
        println("Observer2: observes -> my value is changed in Subject to $value")
    }
}