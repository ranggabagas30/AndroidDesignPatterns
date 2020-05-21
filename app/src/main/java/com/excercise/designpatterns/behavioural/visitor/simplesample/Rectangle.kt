package com.excercise.designpatterns.behavioural.visitor.simplesample

open class Rectangle(var width: Float, var height: Float):
    Shape {

    override fun moveTo(x: Float, y: Float) {

    }

    override fun draw() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}