package com.hathy.kotlinsample

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.another_activity.myMessage

public class AnotherActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.another_activity)
        myMessage.setText("Hello")
    }
}