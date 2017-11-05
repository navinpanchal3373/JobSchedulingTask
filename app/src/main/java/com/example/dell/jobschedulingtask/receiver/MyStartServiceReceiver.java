package com.example.dell.jobschedulingtask.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresApi;

import com.example.dell.jobschedulingtask.utility.Util;

@RequiresApi(23)
public class MyStartServiceReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Util.scheduleJob(context);
    }
}