package com.example.bottomnavigationbar.Healthy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnavigationbar.R;
import com.example.bottomnavigationbar.examination.ExamContent;

import java.util.ArrayList;

public class HealthRecyclerAdapter extends RecyclerView.Adapter<HealthRecyclerAdapter.HealthRecyclerHolder> {

    ArrayList<Health> health;

    public HealthRecyclerAdapter(ArrayList<Health> contents) {
        this.health = contents;
    }


    @NonNull
    @Override
    public HealthRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.healthy_item, parent, false);
        HealthRecyclerHolder holder = new HealthRecyclerHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HealthRecyclerHolder holder, int position) {

         Health h = health.get(position);
         holder.tittle.setText(h.getTittle());
    }


    @Override
    public int getItemCount() {
        return health.size();
    }


    class HealthRecyclerHolder extends RecyclerView.ViewHolder{

        TextView tittle;

        public HealthRecyclerHolder(@NonNull View itemView) {
            super(itemView);

            tittle = itemView.findViewById(R.id.h_tittle);
        }
    }
}
