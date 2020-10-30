package com.example.footballcampleauge.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.footballcampleauge.R;
import com.example.footballcampleauge.model.GamesModel;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.GamesViewHolder> {
    Context context;
    List<GamesModel.Games> gameList;
    GamesModel.Games games;

    @NonNull
    @Override
    public GamesAdapter.GamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.games_info, parent, false);
        return new GamesAdapter.GamesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GamesAdapter.GamesViewHolder holder, int position) {

        games = gameList.get(position);
        holder.strEvent.setText(games.getStrEvent()== null ? "N/A" : games.getStrEvent());
        holder.strLeague.setText(games.getStrLeague()== null ? "N/A" : games.getStrLeague());
        holder.strHomeTeam.setText(games.getStrHomeTeam()== null ? "N/A" : games.getStrHomeTeam());
        holder.strAwayTeam.setText(games.getStrAwayTeam()== null ? "N/A" : games.getStrAwayTeam());
        holder.strVenue.setText(games.getStrVenue() == null ? "N/A" : games.getStrVenue());
        holder.intHomeScore.setText(games.getIntHomeScore() == null ? "N/A" : games.getIntHomeScore());
        holder.intAwayScore.setText(games.getIntAwayScore() == null ? "N/A" : games.getIntAwayScore());
        holder.strTimestamp.setText(games.getStrTimestamp() == null ? "N/A" : games.getStrTimestamp());


    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }

    public class GamesViewHolder extends RecyclerView.ViewHolder {
        TextView strEvent;
        TextView strLeague;
        TextView strHomeTeam;
        TextView strAwayTeam;
        TextView strVenue;
        TextView intHomeScore;
        TextView intAwayScore;
        TextView strTimestamp;

        public GamesViewHolder(@NonNull View itemView) {
            super(itemView);
            strEvent = itemView.findViewById(R.id.strEvent);
            strLeague = itemView.findViewById(R.id.strLeague);
            strHomeTeam = itemView.findViewById(R.id.strHomeTeam);
            strAwayTeam = itemView.findViewById(R.id.strAwayTeam);
            strVenue = itemView.findViewById(R.id.strVenue);
            intAwayScore = itemView.findViewById(R.id.intAwayScore);
            strTimestamp = itemView.findViewById(R.id.strTimestamp);
            intHomeScore = itemView.findViewById(R.id.intHomeScore);

        }
    }
    public  GamesAdapter(Context context, List<GamesModel.Games> gamesList){
        this.context = context;
        this.gameList = gamesList;
    }
}
