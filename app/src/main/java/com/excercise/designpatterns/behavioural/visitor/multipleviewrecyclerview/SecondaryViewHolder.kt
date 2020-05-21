package com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview

import android.view.View
import kotlinx.android.synthetic.main.item_secondary_view.view.*

class SecondaryViewHolder(itemView: View) : BaseViewHolder<Item>(itemView) {
    override fun bind(model: Item) {
        itemView.tv_name.text = model.name.capitalize()
        itemView.tv_type.text = model.type
    }
}