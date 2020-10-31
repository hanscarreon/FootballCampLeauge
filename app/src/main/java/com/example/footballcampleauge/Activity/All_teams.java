package com.example.footballcampleauge.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.footballcampleauge.Api;
import com.example.footballcampleauge.DataController;
import com.example.footballcampleauge.R;
import com.example.footballcampleauge.adapter.TeamsAdapter;
import com.example.footballcampleauge.model.TeamsModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class All_teams extends AppCompatActivity {
    RecyclerView recyclerView;
    ProgressBar loadingData;
    DataController dataController;
    CountDownTimer countDownTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_teams);
        dataController = new DataController(this);
        recyclerView = findViewById(R.id.teams_recycler);
        GridLayoutManager grid = new GridLayoutManager(this, 2,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(grid);

        TeamsAdapter adapter = new TeamsAdapter(All_teams.this,  dataController.retrieveTeams());
        recyclerView.setAdapter(adapter);
    }


}