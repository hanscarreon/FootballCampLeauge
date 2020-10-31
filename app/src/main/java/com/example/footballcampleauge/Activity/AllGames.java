package com.example.footballcampleauge.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.footballcampleauge.Api;
import com.example.footballcampleauge.DataController;
import com.example.footballcampleauge.R;
import com.example.footballcampleauge.adapter.GamesAdapter;
import com.example.footballcampleauge.adapter.LeaguesAdapter;
import com.example.footballcampleauge.model.GamesModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AllGames extends AppCompatActivity {
    ProgressBar progressBar;
    RecyclerView recyclerView;
    DataController dataController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_games);
        dataController = new DataController(this);
        recyclerView = findViewById(R.id.all_games);
        GridLayoutManager grid =  new GridLayoutManager(this, 1 ,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(grid);

        GamesAdapter adapter = new GamesAdapter(AllGames.this,  dataController.retrieveGames());
        recyclerView.setAdapter(adapter);

    }

}