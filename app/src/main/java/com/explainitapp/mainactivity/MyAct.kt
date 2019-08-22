package com.explainitapp.mainactivity

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar



class MyAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my)

        // get seekbar from view
        val rangeSeekbar = findViewById<CrystalRangeSeekbar>(R.id.rangeSeekbar1)

// get min and max text view
        val tvMin = findViewById<TextView>(R.id.textView5)
        val tvMax = findViewById<TextView>(R.id.textView4)

// set listener
        rangeSeekbar.setOnRangeSeekbarChangeListener { minValue, maxValue ->
            tvMin.text = minValue.toString()
            tvMax.text = maxValue.toString()
        }

// set final value listener
        rangeSeekbar.setOnRangeSeekbarFinalValueListener { minValue, maxValue ->
            Log.d(
                "CRS=>",
                "$minValue : $maxValue"
            )
        }

    }
}
