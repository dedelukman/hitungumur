package com.abahstudio.startup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buFindAgeEven(view: View) {
        // fire when button is clicked
        val userDOB:String = etDOB.text.toString()
        val year:Int = Calendar.getInstance().get(Calendar.YEAR)
        if (userDOB.length>year.toString().length){   // to handle errors due to integer length
            tvShowAge.text="input tidak valid"
            return
        } else
        if (userDOB.toInt()>year || userDOB.toInt()==0){ 
            tvShowAge.text="input tidak valid"
            return
        }
        val myAge= year - userDOB.toInt()
//        var avg = myAge/userDOB.toInt()
        tvShowAge.text= "Umurmu adalah $myAge tahun"
    }
}
