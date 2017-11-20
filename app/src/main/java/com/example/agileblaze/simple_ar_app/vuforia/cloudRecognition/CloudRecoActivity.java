package com.example.agileblaze.simple_ar_app.vuforia.cloudRecognition;

import android.widget.Toast;

import com.example.agileblaze.simple_ar_app.network.IRealityBaseActivity;

/**
 * Created by agileblaze on 20/11/17.
 */

public class CloudRecoActivity extends IRealityBaseActivity{

    @Override
    public void onNetworkAvailable() {

    }

    @Override
    public void onNetworkGone() {
        Toast.makeText(this,"network is not available please check",Toast.LENGTH_LONG).show();

    }
}
