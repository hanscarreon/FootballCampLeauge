package com.example.footballcampleauge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class Splash extends AppCompatActivity {
    ImageView splash;
    DataController controller;
    CountDownTimer countDownTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        controller = new DataController(this);
        splash = findViewById(R.id.splash);
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(splash);
        Glide.with(this).load(R.drawable.india).into(imageViewTarget);
        controller.getTeamsIndia();
        controller.getLeagueIndia();
        controller.getGamesIndia();
        getData();

    }

    public void getData(){
        countDownTimer = new CountDownTimer(1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                if(controller.retrieveTeams() != null &&  controller.retrieveLeagues() != null && controller.retrieveGames() != null ){
                    Intent intent = new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    getData();
                }
            }
        }.start();
    }
}