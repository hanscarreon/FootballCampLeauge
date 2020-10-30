package com.example.footballcampleauge.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.footballcampleauge.R;
import com.example.footballcampleauge.model.Leagues_model;
import com.squareup.picasso.Picasso;

import java.util.List;

public class LeaguesAdapter extends RecyclerView.Adapter<LeaguesAdapter.LeaguesViewHolder> {
    Context context;
    List<Leagues_model.Leagues> leagueList;
    Leagues_model.Leagues leagues;

    @NonNull
    @Override
    public LeaguesAdapter.LeaguesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.league_info, parent, false);
        return new LeaguesAdapter.LeaguesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LeaguesAdapter.LeaguesViewHolder holder, int position) {
        leagues = leagueList.get(position);
        Picasso.get().load(leagues.getStrBadge()).into(holder.strBadge);
        holder.strLeague.setText(leagues.getStrLeague() == null ? "N/A" : leagues.getStrLeague());
        holder.strDescriptionEN.setText(leagues.getStrDescriptionEN() == null ? "N/A" : leagues.getStrDescriptionEN());
        holder.strCurrentSeason.setText(leagues.getStrCurrentSeason() == null ? "N/A" : leagues.getStrCurrentSeason());


    }

    @Override
    public int getItemCount() {
        return leagueList.size();
    }

    public class LeaguesViewHolder extends RecyclerView.ViewHolder {
        ImageView strBadge;
        TextView strLeague;
        TextView strDescriptionEN;
        TextView strCurrentSeason;
        public LeaguesViewHolder(@NonNull View itemView) {
            super(itemView);
            strBadge = itemView.findViewById( R.id.strBadge);
            strLeague = itemView.findViewById( R.id.strLeague);
            strDescriptionEN = itemView.findViewById( R.id.strDescriptionEN);
            strCurrentSeason = itemView.findViewById( R.id.strCurrentSeason);

        }

    }

    public LeaguesAdapter(Context context,  List<Leagues_model.Leagues> leagueList){
        this.context = context;
        this.leagueList = leagueList;
    }
}
