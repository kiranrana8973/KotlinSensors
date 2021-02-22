package com.kiran.kotlinsensors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    private lateinit var btnShowAllSensors: Button
    private lateinit var btnAccelerometer: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btnAccelerometer = findViewById(R.id.btnAccelerometer)
        btnShowAllSensors = findViewById(R.id.btnShowAllSensors)

        btnAccelerometer.setOnClickListener {
            startActivity(Intent(this, AccelerometerActivity::class.java))
        }

        btnShowAllSensors.setOnClickListener {
            startActivity(Intent(this, CheckSensorActivity::class.java))
        }
    }
}