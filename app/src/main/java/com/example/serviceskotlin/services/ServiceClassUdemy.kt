package com.example.serviceskotlin.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ServiceClassUdemy : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        Log.d(TAG, "onCreate: ")
        super.onCreate()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: ")
        super.onDestroy()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "onStartCommand: ")
        return super.onStartCommand(intent, flags, startId)
    }

    companion object {
        private const val TAG = "ServiceClassUdemy"
    }
}