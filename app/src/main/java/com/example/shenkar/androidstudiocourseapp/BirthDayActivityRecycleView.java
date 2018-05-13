package com.example.shenkar.androidstudiocourseapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

class BirthDayActivityRecycleView extends RecyclerView.Adapter<BirthDayActivityRecycleView.ViewHolder> {

    Context context;
    ArrayList<String> birthDay;

    public BirthDayActivityRecycleView(Context context, ArrayList<String> birthDay) {
        this.context = context;
        this.birthDay = birthDay;
    }

    @NonNull
    @Override
    public BirthDayActivityRecycleView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_birtday_list , parent , false);
        return new ViewHolder(view);
    }

    @Override

    public void onBindViewHolder(@NonNull BirthDayActivityRecycleView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
