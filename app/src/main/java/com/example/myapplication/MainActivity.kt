package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import android.view.View
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var settingBtn: ImageView
        settingBtn = findViewById(R.id.settingBtn) as ImageView
        val context = this
        settingBtn.setOnClickListener{
            val intent = Intent(context, secondActivity::class.java)
            startActivity(intent)
        }


        //declarating SeekBar and TextView
        lateinit var tempSeekBar: SeekBar
        lateinit var temp: TextView
        //Finding SeekBar and TextView ids
        tempSeekBar = findViewById(R.id.tempSeekBar) as SeekBar
        temp = findViewById(R.id.temp) as TextView

        //SeekBar inputing informaton about temperature
        tempSeekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                temp.text = progress.toString()//because textview is String and we have progress as Integer
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        settingBtn.setOnClickListener{
            val intent = Intent(this, secondActivity::class.java)
            startActivity(intent)
        }


    }

}














