package com.example.agileblaze.simple_ar_app.network;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;

public abstract class IRealityBaseActivity extends AppCompatActivity {

    private static final String TAG = "IRealityBaseActivity";
    public BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent.getExtras().getBoolean(IRealityNetworkManager.IS_NETWORK_CONNECTED)){
                onNetworkAvailable();
            }else{
                onNetworkGone();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    protected void onResume() {
        super.onResume();
        LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver,
                new IntentFilter(IRealityNetworkManager.NETWORK));

    }

    @Override
    protected void onPause() {
        super.onPause();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
    }

    public abstract void onNetworkAvailable();
    public abstract void onNetworkGone();
}