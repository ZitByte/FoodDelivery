package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);
    }

    public void toMainScreen(View view) {
        Intent intent2 = new Intent(this,MainScreen.class);
        startActivity(intent2);
    }

    public void toBordingScreen2(View view) {
        Intent intent3 = new Intent(this,OnBordingScreen2.class);
        startActivity(intent3);
    }
}