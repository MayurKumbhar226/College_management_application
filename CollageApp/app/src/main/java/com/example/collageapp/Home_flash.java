package com.example.collageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Home_flash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_flash);

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {

              Intent i = new Intent(Home_flash.this, MainActivity.class);
              startActivity(i);
              finish();

          }
      }, 1000);
    }
}