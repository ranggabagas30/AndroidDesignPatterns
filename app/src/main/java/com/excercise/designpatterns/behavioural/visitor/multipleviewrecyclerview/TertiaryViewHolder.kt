package com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview

import android.view.View
import kotlinx.android.synthetic.main.item_tertiary_view.view.*

class TertiaryViewHolder(itemView: View): BaseViewHolder<Item>(itemView) {
    override fun bind(model: Item) {
        itemView.tv_name.text = model.name.toLowerCase()
        itemView.tv_type.text = model.type
    }
}