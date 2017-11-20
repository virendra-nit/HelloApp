package com.example.agileblaze.simple_ar_app.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.agileblaze.simple_ar_app.R;

public class Home extends AppCompatActivity {
    private ImageButton scanImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        scanImage=(ImageButton)findViewById(R.id.scan_icon);
        scanImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Register.class);
                startActivity(intent);

            }
        });
    }
}
