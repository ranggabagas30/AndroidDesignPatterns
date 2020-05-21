package com.excercise.designpatterns.behavioural.visitor.simplesample

class Circle(var radius: Float) :
    Shape {

    override fun moveTo(x: Float, y: Float) {

    }

    override fun draw() {

    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}