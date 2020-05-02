package com.example.bottomnavigationbar.Healthy;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bottomnavigationbar.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class HealthFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Health> h = new ArrayList<>();
    TextView errorMessage;

    public HealthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_health, container, false);

        recyclerView = v.findViewById(R.id.analyze_recycle);
        errorMessage = v.findViewById(R.id.heath_error_text);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://gabamnml-health-v1.p.rapidapi.com/")
                .build();

        ApiInterface apiInterface = retrofit.create(ApiInterface.class);

        Call<Health> call = apiInterface.getHealth();

        call.enqueue(new Callback<Health>() {
            @Override
            public void onResponse(Call<Health> call, Response<Health> response) {

                h.add(response.body());

                HealthRecyclerAdapter adapter = new HealthRecyclerAdapter(h);

                RecyclerView.LayoutManager lm = new LinearLayoutManager(getContext());

                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(lm);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<Health> call, Throwable t) {

                errorMessage.setText(t.getMessage());

            }
        });

        return v;
    }
}

