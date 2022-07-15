package com.example.notification

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import com.example.notification.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSimpleNotif.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
            val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_MUTABLE)

            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

            val notification = NotificationCompat
                .Builder(this, "myNotif")
                .setSmallIcon(android.R.drawable.stat_notify_chat)
                .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.img_large_icon))
                .setContentTitle("leonardo")
                .setContentText("Let's have a dinner...")
                .setContentIntent(pendingIntent)
                .build()

            notificationManager.notify((10..100).random(), notification)
        }

        binding.btnBigPictureNotif.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
            val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_MUTABLE)

            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

            val notification = NotificationCompat
                .Builder(this, "myNotif")
                .setSmallIcon(android.R.drawable.stat_notify_chat)
                .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.img_large_icon))
                .setContentTitle("leonardo")
                .setContentText("Let's have a dinner...")
                .setContentIntent(pendingIntent)
                .setStyle(NotificationCompat.BigPictureStyle().bigPicture(BitmapFactory.decodeResource(resources, R.drawable.img_big_picture)))
                .build()

            notificationManager.notify((10..100).random(), notification)
        }

        binding.btnBigTextNotif.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
            val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_MUTABLE)

            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

            val notification = NotificationCompat
                .Builder(this, "myNotif")
                .setSmallIcon(android.R.drawable.stat_notify_chat)
                .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.img_large_icon))
                .setContentTitle("leonardo")
                .setContentText("Let's have a dinner...")
                .setContentIntent(pendingIntent)
                .setStyle(NotificationCompat.BigTextStyle().bigText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
                .build()

            notificationManager.notify((10..100).random(), notification)
        }

        binding.btnInboxNotif.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
            val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_MUTABLE)

            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

            val notification = NotificationCompat
                .Builder(this, "myNotif")
                .setSmallIcon(android.R.drawable.stat_notify_chat)
                .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.img_large_icon))
                .setContentTitle("leonardo")
                .setContentText("Let's have a dinner...")
                .setContentIntent(pendingIntent)
                .setStyle(NotificationCompat.InboxStyle()
                    .addLine("hello")
                    .addLine("how are you")
                    .addLine("please answer")
                    .addLine("where are you"))
                .build()

            notificationManager.notify((10..100).random(), notification)
        }
    }
}