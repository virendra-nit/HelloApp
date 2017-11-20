package com.example.agileblaze.simple_ar_app.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.agileblaze.simple_ar_app.R;
import com.example.agileblaze.simple_ar_app.network.IRealityBaseActivity;
import com.example.agileblaze.simple_ar_app.network.NetworkChecker;

public class Login extends IRealityBaseActivity {

    private static final String TAG = "Login";
    private TextView txtSignUp;
    private Button btnSignIn;
    private TextView btnSkipLogin;
    NetworkChecker networkChecker;
    private TextView txtForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initialize();
       networkChecker = new NetworkChecker(this);
    }
    @Override
    public void onNetworkAvailable() {

   }
   @Override
    public void onNetworkGone() {
        Toast.makeText(Login.this, "Network is not availbale please check", Toast.LENGTH_LONG)
                .show();
    }

    private void initialize() {
        txtSignUp = (TextView) findViewById(R.id.txtSignUp);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSkipLogin = (TextView)findViewById(R.id.txtSkipLogin);
        txtForgotPassword = (TextView)findViewById(R.id.txtForgotPassword);
        setupControls();
    }

    private void setupControls() {
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Not Implemented", Toast.LENGTH_SHORT).show();
            }
        });
        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoRegister = new Intent(Login.this, Register.class);
                startActivity(gotoRegister);
                // overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });
        btnSkipLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoHome = new Intent(Login.this, Home.class);
                startActivity(gotoHome);
                // overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        networkChecker.notifyNetworkStatus();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
