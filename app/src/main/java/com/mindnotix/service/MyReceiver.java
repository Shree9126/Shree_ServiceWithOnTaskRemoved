package com.mindnotix.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("PERUSU", "onReceive in MyReceiver");
        context.startService(new Intent(context, MyService.class));
    }
}
