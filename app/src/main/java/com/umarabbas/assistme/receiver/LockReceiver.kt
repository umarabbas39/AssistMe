package com.umarabbas.assistme.receiver

import android.app.admin.DevicePolicyManager
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent

class LockReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        //checking if app has device admin permission and if has then lock the phone
        val deviceManager = context?.getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
        val componentName = ComponentName(context, DeviceAdmin::class.java)
        if(deviceManager.isAdminActive(componentName)){
                deviceManager.lockNow()
            }

    }
}