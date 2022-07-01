package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class OnBordingScreen2 extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_bording_screen2);
    }

    public boolean onTouchEvent(MotionEvent touchEvent){



        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();


                if(x1 < x2 ) {
                    Intent i = new Intent(OnBordingScreen2.this, OnBordingScreen1.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }

    public void toSignIn(View view) {
        Intent intent1 = new Intent(this,SighInScreen.class);
        startActivity(intent1);
    }

    public void toSignUp(View view) {
        Intent intent2 = new Intent(this,SignUpScreen.class);
        startActivity(intent2);
    }
}