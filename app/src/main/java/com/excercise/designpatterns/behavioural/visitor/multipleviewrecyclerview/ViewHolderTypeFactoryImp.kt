package com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview

import android.view.View
import com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview.Item.Companion.PRIMARY
import com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview.Item.Companion.PRIMARY_VIEW
import com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview.Item.Companion.SECONDARY
import com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview.Item.Companion.SECONDARY_VIEW
import com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview.Item.Companion.TERTIARY_VIEW

class ViewHolderTypeFactoryImp : ViewHolderTypeFactory {
    override fun type(item: Item): Int {
        return when(item.type) {
            PRIMARY -> PRIMARY_VIEW
            SECONDARY -> SECONDARY_VIEW
            else -> TERTIARY_VIEW
        }
    }

    override fun create(parent: View, viewType: Int): BaseViewHolder<Item> {
        return when(viewType) {
            PRIMARY_VIEW -> PrimaryViewHolder(parent)
            SECONDARY_VIEW -> SecondaryViewHolder(parent)
            else -> TertiaryViewHolder(parent)
        }
    }
}