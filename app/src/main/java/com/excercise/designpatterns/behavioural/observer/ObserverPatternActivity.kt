package com.excercise.designpatterns.behavioural.observer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.excercise.designpatterns.R
import com.excercise.designpatterns.behavioural.observer.multiobserver.Observer1
import com.excercise.designpatterns.behavioural.observer.multiobserver.Observer2
import com.excercise.designpatterns.behavioural.observer.multiobserver.Subject1
import com.excercise.designpatterns.behavioural.observer.singleobserver.Observer
import com.excercise.designpatterns.behavioural.observer.singleobserver.Subject

class ObserverPatternActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_observer_pattern)
        //singleObserverPattern()
        multiObserverPattern()
    }

    private fun singleObserverPattern() {
        println("Observer pattern demo")
        var observer =
            Observer()
        var subject =
            Subject()
        subject.register(observer)

        println("Setting flag = 5")
        subject._flag = 5

        println("Setting flag= 25")
        subject._flag = 25
        subject.unregister(observer)

        println("Setting flag = 50")
        subject._flag = 50
    }

    private fun multiObserverPattern() {
        println("Multi observer pattern demo")
        val subject1 = Subject1()
        val observer1 = Observer1()
        val observer2 = Observer2()

        subject1.register(observer1)
        subject1.register(observer2)

        println("Setting value = 5")
        subject1.myValue = 5

        println("Setting value = 25")
        subject1.myValue = 25

        println("Unregister observer1 only")
        subject1.unregister(observer1)

        println("Setting value = 100")
        subject1.myValue = 100
    }
}
