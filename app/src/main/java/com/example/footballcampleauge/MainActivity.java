package com.example.footballcampleauge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.footballcampleauge.Activity.All_teams;

public class MainActivity extends AppCompatActivity {
    ImageView teamsBtn;
    ImageView leaguesBtn;
//    ImageView teamsBtn;
//    ImageView teamsBtn;
//    ImageView teamsBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        teamsBtn = findViewById(R.id.teamsBtn);
        leaguesBtn = findViewById(R.id.leagues);

//        teamsBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                nextIntent(MainActivity.this, All_teams.class);
//            }
//        });
//
//        leaguesBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                nextIntent(MainActivity.this, All_teams.class);
//            }
//        });
    }

    public void nextIntent(){
//        Context context,Class Toclass
//        Intent intent = new Intent(context, Toclass);
//        startActivity(intent);
    }

    public void nextIntent(View view) throws ClassNotFoundException {
        Log.d("msg","view::::"+view.getTag());
//        Class classes = Class.forName("com.example.footballcampleauge.Activity."+view.getTag());
        Intent intent = new Intent(MainActivity.this, Class.forName("com.example.footballcampleauge.Activity."+view.getTag()));
        startActivity(intent);
//        finish();
    }
}