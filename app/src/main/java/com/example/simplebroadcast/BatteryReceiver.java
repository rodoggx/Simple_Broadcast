package com.example.simplebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BatteryReceiver extends BroadcastReceiver {
    private static final String TAG = "BatteryReceiverTAG_";

    public BatteryReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive Battery: ");
        String action = intent.getAction();
        Toast.makeText(context, "Battery Change " + action, Toast.LENGTH_SHORT).show();
    }
}
