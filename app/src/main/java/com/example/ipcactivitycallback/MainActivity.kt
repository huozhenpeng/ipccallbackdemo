package com.example.ipcactivitycallback

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.setOnClickListener {
            var intent:Intent=Intent()
            //当然，如果是调用其他app的Activity，是不能这么写的，比如说微信分享页面
            intent.setClass(MainActivity@this,SecondActivity::class.java)
            startActivityForResult(intent,0x01)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Toast.makeText(MainActivity@this,data?.getStringExtra("name"),Toast.LENGTH_SHORT).show()
    }
}
