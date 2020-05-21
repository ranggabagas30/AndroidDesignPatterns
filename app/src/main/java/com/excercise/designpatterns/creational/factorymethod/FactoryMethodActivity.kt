package com.excercise.designpatterns.creational.factorymethod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.excercise.designpatterns.R

class FactoryMethodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory_method)

        var logistics = arrayListOf(
            RoadLogistic(),
            SeaLogistic()
        )

        for (logistic in logistics) {
            logistic.planDelivery()
        }
    }
}
