package com.josephben.nativetest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    static {
        System.loadLibrary("hello-jni");
    }

    public native String  stringFromJNI();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView  tv = new TextView(this);
        tv.setText(stringFromJNI());
        setContentView(tv);
    }
}
