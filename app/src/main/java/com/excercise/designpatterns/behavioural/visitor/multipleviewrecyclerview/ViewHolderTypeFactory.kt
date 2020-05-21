package com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview

import android.view.View

// Visitor interface
// VIewHolderTypeFactory will visit the Item object to determine the ViewHolder type
interface ViewHolderTypeFactory {
    fun type(item: Item): Int
    fun create(parent: View, viewType: Int) : BaseViewHolder<Item> // creating ViewHolder
}