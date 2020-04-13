package com.example.bottomnavigationbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapterSurgery extends RecyclerView.Adapter<RecyclerViewAdapterSurgery.SurgeryViewHolder> {

    ArrayList<sheetSurgery> sheetSurgeries;
    // عشان ابعت البيانات من الخارج
    public RecyclerViewAdapterSurgery(ArrayList<sheetSurgery> sheetSurgeries) {
        this.sheetSurgeries = sheetSurgeries;
    }

    @NonNull
    @Override
    // هتستدعي بعدد مرات ال card اللي هيعرض في الشاشه لاول مرة فقط
    public SurgeryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.schema_card_surrgery, null, false);
        SurgeryViewHolder surgeryViewHolder = new SurgeryViewHolder(v);
        return surgeryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SurgeryViewHolder holder, int position) {
        sheetSurgery s =
                sheetSurgeries.get(position);
        holder.tv_date.setText(s.getDate());
        holder.tv_nameDoctor.setText(s.getNameDoctor());
        holder.tv_typeSurgery.setText(s.getTypeSurgery());
    }

    @Override
    public int getItemCount() {
        return sheetSurgeries.size();
    }


    // holder class for recycler view
    class SurgeryViewHolder extends RecyclerView.ViewHolder{
        TextView tv_date, tv_nameDoctor, tv_typeSurgery;

        public SurgeryViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_date = itemView.findViewById(R.id.tv_Date);
            tv_nameDoctor = itemView.findViewById(R.id.tv_nameDoctor);
            tv_typeSurgery = itemView.findViewById(R.id.tv_typeSurgery);
        }
    }


}
