package com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview

// parent class for Item model so that all models accept a visitor
interface BaseModel {
    fun type(viewHolderTypeFactory: ViewHolderTypeFactory) : Int
}