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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_leagues);

        loadingData = findViewById(R.id.progressBar);
        recyclerView = findViewById(R.id.leagues_recycler);
        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(llm);
        loadingData.setVisibility(View.VISIBLE);
        getLeagueIndia();
    }

    public void getLeagueIndia(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<Leagues_model> call = api.getLeague();

        call.enqueue(new Callback<Leagues_model>(){
            @Override
            public void onResponse(Call<Leagues_model> call, Response<Leagues_model> response) {
                List<Leagues_model.Leagues> leagues = response.body().getLeagues();

                LeaguesAdapter adapter = new LeaguesAdapter(allLeagues.this, leagues);
                LinearSnapHelper snapHelper = new LinearSnapHelper();
                snapHelper.attachToRecyclerView(recyclerView);

                recyclerView.setAdapter(adapter);
                loadingData.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<Leagues_model> call, Throwable t) {
                Toast.makeText(allLeagues.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}