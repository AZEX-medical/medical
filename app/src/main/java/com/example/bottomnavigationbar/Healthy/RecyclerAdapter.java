package com.example.bottomnavigationbar.Healthy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnavigationbar.R;
import com.example.bottomnavigationbar.examination.ExamContent;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

    ArrayList<ExamContent> contents;

    public RecyclerAdapter(ArrayList<ExamContent> contents) {
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

    }


    @Override
    public int getItemCount() {
        return contents.size();
    }

    class RecyclerHolder extends RecyclerView.ViewHolder{

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
