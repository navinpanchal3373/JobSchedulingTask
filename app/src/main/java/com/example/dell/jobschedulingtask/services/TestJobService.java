package com.example.dell.jobschedulingtask.services;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.support.annotation.RequiresApi;

import com.example.dell.jobschedulingtask.utility.Util;

/**
 * Created by dell on 11/5/2017.
 */
@RequiresApi(23)
public class TestJobService extends JobService {

    private static final String TAG = "SyncService";

    @Override
    public boolean onStartJob(JobParameters params) {
        Intent service = new Intent(getApplicationContext(), BackGroundServiceTask.class);
        getApplicationContext().startService(service);
        Util.scheduleJob(getApplicationContext()); // reschedule the job
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
