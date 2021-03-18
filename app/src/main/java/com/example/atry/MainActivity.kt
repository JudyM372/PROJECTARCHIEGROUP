package com.example.atry

import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.util.Base64
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    //private val _mediaPlayer: MediaPlayer? = null
  //  var _mediaPlayer: MediaPlayer? = null
    var _mediaPlayer: MediaPlayer? = null
    //private var _mediaPlayer: MediaPlayer? = null
    val USERNAME = "login"
    val PASSWORD = "camera"
    val RTSP_URL = "rtsp://192.168.1.140:5540/ch0"

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSend = btnOkay
        val myRtsp = etRtsp

        btnSend.setOnClickListener{
            val myIntent = Intent(this@MainActivity, MainActivity2::class.java)
            val sentRtsp = myRtsp.text.toString()
            myIntent.putExtra("MESSAGE", sentRtsp)
            startActivityForResult(myIntent, SHOW_SUBACTIVITY)
        }
    }
    
    companion object{
        private val LOG_TAG: String? = MainActivity::class.simpleName
        private const val SHOW_SUBACTIVITY = 1
    }
}
