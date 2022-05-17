package com.shinyelee.android_study2

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener { ShowNotification("제목", "내용") }
    }

    fun ShowNotification(Title: String, Body: String) {

        val pending = PendingIntent.getActivity(this, 0, Intent(this, MainActivity::class.java), PendingIntent.FLAG_CANCEL_CURRENT)

        val builder = NotificationCompat.Builder(this, "id")

        builder.setSmallIcon(R.drawable.ic_baseline_create_24)
            .setContentTitle(Title)
            .setContentText(Body)
            .setContentIntent(pending)
            .setAutoCancel(true)
            .setDefaults(Notification.DEFAULT_SOUND or Notification.DEFAULT_VIBRATE)

        val NManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NManager.createNotificationChannel(NotificationChannel("id", "name", NotificationManager.IMPORTANCE_HIGH))
        }
        NManager.notify(0, builder.build())

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}