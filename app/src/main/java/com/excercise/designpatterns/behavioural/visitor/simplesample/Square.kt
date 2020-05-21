package com.excercise.designpatterns.behavioural.visitor.simplesample

class Square(side: Float): Rectangle(side, side) {
    override fun accept(v: Visitor) {
        v.visit(this)
    }
}