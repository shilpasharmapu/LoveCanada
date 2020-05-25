package com.example.lovecanada.Layout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.lovecanada.R;

public class SplashActivity extends AppCompatActivity {
    private final int duration = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {


            Intent intent = new Intent(SplashActivity.this, AttractionListActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        },duration);
}
}
