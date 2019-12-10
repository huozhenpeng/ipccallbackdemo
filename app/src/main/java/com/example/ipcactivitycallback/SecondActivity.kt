package com.example.ipcactivitycallback

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tv2.setOnClickListener {
            setResult(Activity.RESULT_OK,intent.putExtra("name","名字"))
            finish()
        }
    }
}