package com.example.simplebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class ConnectionReceiver extends BroadcastReceiver {
    private static final String TAG = "ConnectionReceiverTAG_";

    public ConnectionReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive Connectivity: ");
        String action = intent.getAction();
        Toast.makeText(context, "Connectivity Change " + action, Toast.LENGTH_SHORT).show();
    }
}
