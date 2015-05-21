package com.hathy.kotlinsample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class YetAnotherActivity extends Activity {

    private int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        a=10;
        b=20;
        Log.d("MESSAGE", "The sum is "+(a+b));
    }
}
