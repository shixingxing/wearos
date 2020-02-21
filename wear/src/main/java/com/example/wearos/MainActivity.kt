package com.example.wearos

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import com.google.android.gms.wearable.DataClient
import com.google.android.gms.wearable.Wearable

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        setAmbientEnabled()

        val dataClient: DataClient = Wearable.getDataClient(this)
    }
}
