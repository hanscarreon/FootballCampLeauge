package com.example.footballcampleauge.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.footballcampleauge.Api;
import com.example.footballcampleauge.DataController;
import com.example.footballcampleauge.R;
import com.example.footballcampleauge.adapter.LeaguesAdapter;
import com.example.footballcampleauge.adapter.TeamsAdapter;
import com.example.footballcampleauge.model.Leagues_model;
import com.example.footballcampleauge.model.Leagues_model;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class allLeagues extends AppCompatActivity {
    ProgressBar loadingData;
    RecyclerView recyclerView;
    DataController dataController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_leagues);
        dataController = new DataController(this);
        recyclerView = findViewById(R.id.leagues_recycler);
        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(llm);
        LinearSnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);
        LeaguesAdapter adapter = new LeaguesAdapter(allLeagues.this,  dataController.retrieveLeagues());
        recyclerView.setAdapter(adapter);
    }

}