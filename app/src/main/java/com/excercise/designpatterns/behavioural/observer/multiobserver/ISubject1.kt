package com.excercise.designpatterns.behavioural.observer.multiobserver

import com.excercise.designpatterns.behavioural.observer.multiobserver.IObserver

interface ISubject1 {
    fun register(iObserver: IObserver)
    fun unregister(iObserver: IObserver)
    fun notifyObservers(value: Int)
}