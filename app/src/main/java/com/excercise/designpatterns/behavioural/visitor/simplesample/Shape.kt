package com.excercise.designpatterns.behavioural.visitor.simplesample

interface Shape {
    fun moveTo(x: Float, y: Float)
    fun draw()
    fun accept(v: Visitor)
}