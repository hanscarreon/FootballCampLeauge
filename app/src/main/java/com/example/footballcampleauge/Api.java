package com.example.footballcampleauge;

import com.example.footballcampleauge.model.GamesModel;
import com.example.footballcampleauge.model.Leagues_model;
import com.example.footballcampleauge.model.TeamsModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://www.thesportsdb.com/api/v1/json/1/";

    @GET("search_all_teams.php?s=Soccer&c=India")
    Call<TeamsModel> getTeams();

    @GET("search_all_leagues.php?c=India&s=Soccer")
    Call<Leagues_model>getLeague();

    @GET("eventspastleague.php?id=4791")
    Call<GamesModel>getGames();

    @GET("eventsnextleague.php?id=4791")
    Call<GamesModel>getNextGames();

}
