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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_teams);

        loadingData = findViewById(R.id.loadingData);
        recyclerView = findViewById(R.id.teams_recycler);
        GridLayoutManager grid = new GridLayoutManager(this, 2,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(grid);

        getTeamsIndia();
    }


    public void getTeamsIndia(){
        loadingData.setVisibility(View.VISIBLE);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<TeamsModel> call = api.getTeams();

        call.enqueue(new Callback<TeamsModel>(){
            @Override
            public void onResponse(Call<TeamsModel> call, Response<TeamsModel> response) {
                List<TeamsModel.Team> teamsModel = response.body().getTeams();
                loadingData.setVisibility(View.GONE);

                TeamsAdapter adapter = new TeamsAdapter(All_teams.this, teamsModel);
                recyclerView.setAdapter(adapter);
//                Log.d("output request: ", teamsModel.get(0).getStrAlternate());
            }

            @Override
            public void onFailure(Call<TeamsModel> call, Throwable t) {
                Toast.makeText(All_teams.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
//            @Override
//            public void onResponse(Call<Players> call, retrofit2.Response<Players> response) {
//                Players playersBody = response.body();
//                List<Players.Datum> playersData = playersBody.getData();
//                saveData(PLAYERS, playersData);
//                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Players Saved!");
//            }
//            @Override
//            public void onFailure(Call<Players> call, Throwable t) {
//                Toast.makeText(activity, t.getMessage(), Toast.LENGTH_SHORT).show();
//                setErrors(PLAYERS_ERROR,t.getMessage());
//                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa "+ t.getMessage());
//            }
        });

    }
}