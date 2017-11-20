package com.example.agileblaze.simple_ar_app.vuforia.sampleApplication;

import android.net.NetworkInfo;
/**
 * Created by agileblaze on 20/11/17.
 */

public interface SampleApplicationControl {
    boolean doInitTrackers();
    boolean doLoadTrackersData();
    boolean doStartTrackers();
    boolean doStopTrackers();
    boolean doUnloadTrackersData();
    boolean doDeinitTrackers();
    void onInitARDone(SampleApplicationException e);
    void onQCARupdate(NetworkInfo.State state);
}
