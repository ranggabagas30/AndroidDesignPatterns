package com.excercise.designpatterns.behavioural.visitor.simplesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.excercise.designpatterns.R
import com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview.Item
import com.excercise.designpatterns.behavioural.visitor.multipleviewrecyclerview.PrimaryRecyclerAdapter
import kotlinx.android.synthetic.main.activity_visitor.*

class VisitorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visitor)
        visitor()
        visitorRecyclerView()
    }

    fun visitor() {
        val dot =
            Dot(
                5.4f,
                4.2f
            )
        val circle =
            Circle(
                20f
            )
        val rectangle =
            Rectangle(
                43f,
                15f
            )
        val square =
            Square(
                23f
            )

        val exportVisitor =
            XmlExportVisitor()
        exportVisitor.export(mutableListOf(dot, circle, rectangle, square))
    }
    fun visitorRecyclerView() {
        val item1 = Item("primary first", Item.PRIMARY)
        val item2 = Item("primary second", Item.PRIMARY)
        val item3 = Item("secondary third", Item.SECONDARY)
        val item4 = Item("tertiary fourth", Item.TERTIARY)
        val item5 = Item("secondary fifth", Item.SECONDARY)
        val items = mutableListOf(item1, item2, item3, item4, item5)

        val primaryAdapter = PrimaryRecyclerAdapter()
        recyclerViewPrimary.adapter = primaryAdapter
        recyclerViewPrimary.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        primaryAdapter.setItems(items)
    }
}
