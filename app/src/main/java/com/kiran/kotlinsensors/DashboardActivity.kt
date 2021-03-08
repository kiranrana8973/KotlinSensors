package com.kiran.kotlinsensors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {

    private lateinit var btnShowAllSensors: Button
    private lateinit var btnAccelerometer: Button
    private lateinit var btnGyro: Button
    private lateinit var btnProximity: Button
    private lateinit var btnLight: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btnAccelerometer = findViewById(R.id.btnAccelerometer)
        btnShowAllSensors = findViewById(R.id.btnShowAllSensors)
        btnGyro = findViewById(R.id.btnGyro)
        btnProximity = findViewById(R.id.btnProximity)
        btnLight = findViewById(R.id.btnLight)

        btnAccelerometer.setOnClickListener {
            startActivity(Intent(this, AccelerometerActivity::class.java))
        }

        btnShowAllSensors.setOnClickListener {
            startActivity(Intent(this, CheckSensorActivity::class.java))
        }

        btnGyro.setOnClickListener {
            startActivity(Intent(this, GyroscopeActivity::class.java))
        }

        btnProximity.setOnClickListener {
            startActivity(Intent(this, ProximityActivity::class.java))
        }

        btnLight.setOnClickListener {
            startActivity(Intent(this, LightActivity::class.java))
        }
    }
}