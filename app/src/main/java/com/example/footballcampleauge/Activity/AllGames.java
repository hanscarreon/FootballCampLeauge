package com.example.footballcampleauge.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.footballcampleauge.Api;
import com.example.footballcampleauge.R;
import com.example.footballcampleauge.adapter.GamesAdapter;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_games);

        progressBar = findViewById(R.id.progressBar2);
        recyclerView = findViewById(R.id.all_games);
        GridLayoutManager grid =  new GridLayoutManager(this, 1 ,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(grid);
        getGamesIndia();


    }

    public  void getGamesIndia(){
        progressBar.setVisibility(View.VISIBLE);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<GamesModel> call = api.getGames();
        call.enqueue(new Callback<GamesModel>() {
            @Override
            public void onResponse(Call<GamesModel> call, Response<GamesModel> response) {

                List<GamesModel.Games> gamesModel = response.body().getEvents();
                progressBar.setVisibility(View.GONE);

                GamesAdapter adapter = new GamesAdapter( AllGames.this,gamesModel);
                recyclerView.setAdapter(adapter);


          }

            @Override
            public void onFailure(Call<GamesModel> call, Throwable t) {
                Toast.makeText(AllGames.this, t.getMessage(), Toast.LENGTH_SHORT).show();


            }
        });

    }
}