package com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<in Model>(view: View) : RecyclerView.ViewHolder(view){
    abstract fun bind(model: Model)
}