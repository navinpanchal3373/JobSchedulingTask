package com.example.dell.jobschedulingtask.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.example.dell.jobschedulingtask.utility.Util;

import java.util.Calendar;

/**
 * Created by dell on 11/5/2017.
 */

public class BackGroundServiceTask extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(getApplicationContext(), "Service Started At : " + Calendar.getInstance().getTime(), Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }
}
