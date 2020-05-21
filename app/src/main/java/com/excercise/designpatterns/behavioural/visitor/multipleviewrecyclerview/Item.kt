package com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview

import com.excercise.designpatterns.R

data class Item (val name: String, val type: String): BaseModel {

    override fun type(viewHolderTypeFactory: ViewHolderTypeFactory): Int {
        return viewHolderTypeFactory.type(this)
    }

    companion object {
        const val PRIMARY = "primary"
        const val SECONDARY = "secondary"
        const val TERTIARY = "tertiary"
        const val PRIMARY_VIEW = R.layout.item_items_view
        const val SECONDARY_VIEW = R.layout.item_secondary_view
        const val TERTIARY_VIEW = R.layout.item_tertiary_view
    }
}