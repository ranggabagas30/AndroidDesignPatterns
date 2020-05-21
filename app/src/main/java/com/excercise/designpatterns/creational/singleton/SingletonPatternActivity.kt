package com.excercise.designpatterns.creational.singleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.excercise.designpatterns.R

class SingletonPatternActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singleton_pattern)

        println("Singleton Pattern Demo")
        println("Trying to make a captaion for our team")
        val captain = MakeCaptainSingletonJava.getInstanceBySingletonHelper()

        println("Trying to make another captain for our team")
        val captain1 = MakeCaptainSingletonJava.getInstanceBySingletonHelper()

        if (captain == captain1) {
            println("captaion and captain1 are same instance")
        }
    }
}
