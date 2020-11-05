package com.example.footballcampleauge.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.footballcampleauge.R;
import com.example.footballcampleauge.model.TeamsModel;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TeamsAdapter extends RecyclerView.Adapter<TeamsAdapter.TeamsViewHolder> {
    Context context;
    List<TeamsModel.Team> teamList;
    TeamsModel.Team team;
    @NonNull
    @Override
    public TeamsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.teams_info, parent, false);
        return new TeamsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final TeamsViewHolder holder, int position) {
        team = teamList.get(position);
        Picasso.get().load(team.getStrTeamBadge()).into(holder.teamPic, new Callback() {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onError(Exception e) {
                 holder.teamPic.setImageResource(R.drawable.brokens);
            }
        });
        holder.teamName.setText(team.getStrTeam() == null ? "N/A" : team.getStrTeam());
        holder.teamAlt.setText(team.getStrAlternate() == null ? "N/A" : team.getStrAlternate() );
//        holder.teamDesc.setText(team.getStrDescriptionEN() == null ? "N/A" : team.getStrDescriptionEN()  );
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    public class TeamsViewHolder extends RecyclerView.ViewHolder {
        ImageView teamPic;
        TextView teamName;
        TextView teamAlt;
        TextView teamDesc;
        public TeamsViewHolder(@NonNull View itemView) {
            super(itemView);
            teamPic = itemView.findViewById(R.id.cardImg);
            teamName = itemView.findViewById(R.id.teamName);
            teamAlt = itemView.findViewById(R.id.teamAlt);
//            teamDesc = itemView.findViewById(R.id.teamDesc);
        }
    }

    public TeamsAdapter(Context context, List<TeamsModel.Team> teamList){
        this.context = context;
        this.teamList = teamList;
    }

}
