package com.kiran.kotlinsensors

import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CheckSensorActivity : AppCompatActivity() {
    private lateinit var sensorManager: SensorManager
    private lateinit var tvSensor: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_sensor)

        tvSensor = findViewById(R.id.tvSensor)
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager

        // Get all the sensors available in your device
        val lstSensors = sensorManager.getSensorList(Sensor.TYPE_ALL)
        for(sensor in lstSensors){
            tvSensor.append(sensor.name + "\n")
        }
    }
}