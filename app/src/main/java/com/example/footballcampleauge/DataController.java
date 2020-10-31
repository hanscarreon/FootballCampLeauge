package com.example.footballcampleauge;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearSnapHelper;

import com.example.footballcampleauge.Activity.All_teams;
import com.example.footballcampleauge.Activity.allLeagues;
import com.example.footballcampleauge.adapter.LeaguesAdapter;
import com.example.footballcampleauge.adapter.TeamsAdapter;
import com.example.footballcampleauge.model.GamesModel;
import com.example.footballcampleauge.model.Leagues_model;
import com.example.footballcampleauge.model.TeamsModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.Context.MODE_PRIVATE;

public class DataController {

    private final String SHARED_PREFS = "shared_prefs";
    private final String TEAMS = "teams";
    private final String LEAGUES = "leagues";
    private final String GAMES = "games";
    Context context;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public DataController(Context context) {
        this.context = context;
        this.sharedPreferences = this.context.getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        this.editor = sharedPreferences.edit();
    }

    public <T> void saveData(String calling, List<T> object){
        Gson gson = new Gson();
        String json = gson.toJson(object);
        editor.putString(calling ,json);
        editor.commit();
    }

    public List<TeamsModel.Team> retrieveTeams(){
        Gson gson = new Gson();
        String json = sharedPreferences.getString(TEAMS,"");
        Type type = new TypeToken<List<TeamsModel.Team>>(){}.getType();
        List<TeamsModel.Team> objects = gson.fromJson(json, type);
        return objects;
    }

    public void getTeamsIndia(){

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
                saveData(TEAMS,teamsModel);


                System.out.println("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Teams Save");
            }

            @Override
            public void onFailure(Call<TeamsModel> call, Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }

        });

    }

    public List<Leagues_model.Leagues> retrieveLeagues(){
        Gson gson = new Gson();
        String json = sharedPreferences.getString(LEAGUES,"");
        Type type = new TypeToken<List<Leagues_model.Leagues>>(){}.getType();
        List<Leagues_model.Leagues> objects = gson.fromJson(json, type);
        return objects;
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
                saveData(LEAGUES,leagues);
                System.out.println("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa League Save");
            }

            @Override
            public void onFailure(Call<Leagues_model> call, Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public List<GamesModel.Games> retrieveGames(){
        Gson gson = new Gson();
        String json = sharedPreferences.getString(GAMES,"");
        Type type = new TypeToken<List<GamesModel.Games>>(){}.getType();
        List<GamesModel.Games> objects = gson.fromJson(json, type);
        return objects;
    }

    public void getGamesIndia(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<GamesModel> call = api.getGames();

        call.enqueue(new Callback<GamesModel>(){
            @Override
            public void onResponse(Call<GamesModel> call, Response<GamesModel> response) {
                List<GamesModel.Games> games = response.body().getEvents();
                saveData(GAMES,games);
                System.out.println("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa GAMES Save");
            }

            @Override
            public void onFailure(Call<GamesModel> call, Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

}
