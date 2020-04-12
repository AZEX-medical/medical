package com.example.bottomnavigationbar.examination;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnavigationbar.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

    ArrayList<Content> contents;

    public RecyclerAdapter(ArrayList<Content> contents) {
        this.contents = contents;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.examination_recycle_item, parent, false);
        RecyclerHolder holder = new RecyclerHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {

        final Content content = contents.get(position);
        holder.type.setText(content.getExam_type());
        holder.date.setText(content.getExam_date());
        holder.image.setImageResource(content.getExam_image());
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    class RecyclerHolder extends RecyclerView.ViewHolder{

        TextView type, date;
        ImageView image;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);

            type = itemView.findViewById(R.id.specula_type);
            date = itemView.findViewById(R.id.specula_date);
            image = itemView.findViewById(R.id.specula_image);
        }
    }
}
