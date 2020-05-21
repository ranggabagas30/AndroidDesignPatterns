package com.excercise.designpatterns.behavioural.observer.multiobserver

import com.excercise.designpatterns.behavioural.observer.multiobserver.IObserver

class Observer1:
    IObserver {
    override fun update(value: Int) {
        println("Observer1: my value in SUBJECT is now: $value")
    }
}