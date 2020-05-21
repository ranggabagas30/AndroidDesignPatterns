package com.excercise.designpatterns.behavioural.visitor.simplesample

class Dot (var x: Float, var y: Float):
    Shape {

    fun getPoint(): Pair<Float, Float> {
        return Pair(x, y)
    }

    override fun moveTo(x: Float, y: Float) {

    }

    override fun draw() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}