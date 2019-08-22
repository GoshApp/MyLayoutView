package com.explainitapp.mainactivity

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar



class MyAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_obj)

        // get seekbar from view
        val rangeSeekbar = findViewById<CrystalRangeSeekbar>(R.id.tv_rec_rang_seek)

        // get min and max text view
        val tvMin = findViewById<TextView>(R.id.tv_rec_duration_from)
        val tvMax = findViewById<TextView>(R.id.tv_rec_duration_to)

        // set listener
        rangeSeekbar.setOnRangeSeekbarChangeListener { minValue, maxValue ->
            tvMax.text = formatting(maxValue)
            tvMin.text = formatting(minValue)
        }

     // set final value listener
        rangeSeekbar.setOnRangeSeekbarFinalValueListener { minValue, maxValue ->
            Log.d(
                "CRS=>",
                "$minValue : $maxValue"
            )
        }

    }

    private fun formatting(value: Number): String? {
        val valueInt = value.toInt()
        var stVal: String? = null

        stVal = if(valueInt < 10){
                "0:0" + valueInt
            }else{ if (valueInt == 60) {
                "01:00"
            } else {
                "0:" + valueInt }
            }
        return stVal
    }
}
