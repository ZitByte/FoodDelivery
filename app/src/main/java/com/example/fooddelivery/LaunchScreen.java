package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LaunchScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcscreen);


        new Thread(() -> {
            try {

                Thread.sleep(3000);
                runOnUiThread(() -> {
                    Intent intent = new Intent(LaunchScreen.this, OnBordingScreen1.class);
                    startActivity(intent);

                    finish();
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }


}