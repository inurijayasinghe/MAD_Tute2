package com.example.usingstrings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(tag: "Lifecycle", msg: "onCreate() invoked");

        TextView tvMsg2 = FindViewById(R.id.tvMsg2);
        tvMsg2.setText(R.string.Msg2);

    }
    public void onStart()
    {
        super.onStart();
        Log.i(tag: "Lifecycle", msg: "onStart() invoked");

    }

    public void onRestart()
    {
        super.onStart();
        Log.i(tag: "Lifecycle", msg: "onRestart() invoked");

    }

    public void onResume()
    {}


}


