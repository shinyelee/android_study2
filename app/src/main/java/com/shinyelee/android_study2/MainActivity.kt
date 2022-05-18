package com.shinyelee.android_study2

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), SensorEventListener {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    lateinit var sensorManager: SensorManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE), SensorManager.SENSOR_DELAY_NORMAL)
        super.onResume()
    }

    override fun onPause() {
        sensorManager.unregisterListener(this)
        super.onPause()
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {
        val x = event?.values?.get(0) as Float
        val y = event?.values?.get(1) as Float
        val z = event?.values?.get(2) as Float
        println(x.toString() + ", " + y.toString() + ", " + z.toString())
    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}