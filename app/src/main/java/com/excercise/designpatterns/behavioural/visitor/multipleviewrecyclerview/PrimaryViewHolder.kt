package com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview

import android.view.View
import kotlinx.android.synthetic.main.item_items_view.view.*

class PrimaryViewHolder(itemView: View) : BaseViewHolder<Item>(itemView) {
    override fun bind(model: Item) {
        itemView.tv_name.text = model.name.toUpperCase()
        itemView.tv_type.text = model.type
    }
}