package com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PrimaryRecyclerAdapter : RecyclerView.Adapter<BaseViewHolder<Item>>() {

    private val typeFactory = ViewHolderTypeFactoryImp()
    private val items = mutableListOf<Item>()

    fun setItems(list: List<Item>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Item> {
        return typeFactory.create(
            LayoutInflater
                .from(parent.context)
                .inflate(viewType, parent, false), viewType
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].type(typeFactory)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Item>, position: Int) {
        holder.bind(items[position])
    }
}