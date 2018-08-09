package com.koro.wificycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //val waitTimer: Float = loadFromSave
    //val scanTimer: Float = loadFromSave
    //val wifiState: String? = loadFromSettings //loads current Wifi State from ????

    override fun onCreate(savedInstanceState: Bundle?) { // handle as init function?
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() { //handle as load state
        super.onStart()
    }

    override fun onResume(){
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        //saveToSave(???????)
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() { // save everything here, shouldn't be called to often
        super.onDestroy()
        //saveTosave(???????)
    }

/*
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState")
    }

*/

/*
    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "onRestoreInstanceState")
    }
*/

/*
    fun loadFromSave(????????????){

    // *insert some shit on loading from saves here*

    }
*/

/*
    fun saveToSave(??????){

     // *insert saving schnannigans here*

     }
*/

}


/*
fun getWiFiStatus(???){//returns if wifi is (e|n|u|m)

    //returns wifi status

}
*/

/*
fun setWiFiStatus(????, state){ //sets status of Wifi to (on/off)

    // set Wifi staus

}
*/


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