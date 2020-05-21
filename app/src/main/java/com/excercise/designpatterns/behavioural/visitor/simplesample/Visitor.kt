package com.excercise.designpatterns.behavioural.visitor.simplesample

import com.excercise.designpatterns.behavioural.visitor.simplesample.Circle
import com.excercise.designpatterns.behavioural.visitor.simplesample.Dot
import com.excercise.designpatterns.behavioural.visitor.simplesample.Rectangle
import com.excercise.designpatterns.behavioural.visitor.simplesample.Square

interface Visitor {
    fun visit(d: Dot)
    fun visit(c: Circle)
    fun visit(r: Rectangle)
    fun visit(s: Square)
}