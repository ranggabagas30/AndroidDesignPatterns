package com.excercise.designpatterns.behavioural.observer.singleobserver

interface ISubject {
    fun register(o: Observer)
    fun unregister(o: Observer)
    fun notifyObservers()
}