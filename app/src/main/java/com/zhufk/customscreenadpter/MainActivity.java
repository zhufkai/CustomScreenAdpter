package com.zhufk.customscreenadpter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Density.setDensity(getApplication(),this);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_screen_adapter);
        setContentView(R.layout.activity_percent);
    }
}
