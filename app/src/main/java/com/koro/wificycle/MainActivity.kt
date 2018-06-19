package com.koro.wificycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //val waitTimer: Float = loadFromSave
    //val scanTimer: Float = loadFromSave
    //val wifiState: String? = loadFromSettings //loads current Wifi State from ????

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*fun loadFromSave(????????????){
    *
    * // *insert some shit on loading from saves here*
    *
    * }
    *
    *
    *
    * */
}

/*
* Changeable Timers:
* Waittime: (5mins)
* Scantime: (30 secs +/- connecttime)
*
* Cycle Wifi off 5mins
* On 30 secs
* scan
* check connection
* //maybe check if networks available are in save networks list and try to connect (timeout 30 secs)
*
*
*
*
* */