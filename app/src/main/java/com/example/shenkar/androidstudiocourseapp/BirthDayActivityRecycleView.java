package com.example.shenkar.androidstudiocourseapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class BirthDayActivityRecycleView extends RecyclerView.Adapter<BirthDayActivityRecycleView.ViewHolder> {

    Context context;
    List<BirthDayInstance> birthDay;

    public BirthDayActivityRecycleView(Context context, List<BirthDayInstance> birthDay) {
        Log.d(AppSettings.TAG , "BirthDayActivityRecycleView: BirthDayActivityRecycleView");
        this.context = context;
        this.birthDay = birthDay;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(AppSettings.TAG , "onCreateViewHolder: BirthDayActivityRecycleView");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_birtday_list , parent , false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override

    public void onBindViewHolder(@NonNull BirthDayActivityRecycleView.ViewHolder holder, int position) {

        Log.d(AppSettings.TAG , "name: " + birthDay.get(position).getFirstName() + "last: " + birthDay.get(position).getLastName() + "date: " + birthDay.get(position).getDate());
        holder.firstName.setText(birthDay.get(position).getFirstName());
        holder.lastName.setText(birthDay.get(position).getLastName());
        holder.myDate.setText( birthDay.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return birthDay.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView firstName;
        TextView lastName;
        TextView myDate;

        public ViewHolder(View itemView) {
            super(itemView);
            Log.d(AppSettings.TAG , "ViewHolder: BirthDayActivityRecycleView");
            firstName = itemView.findViewById(R.id.activity_birthday_list_first_name);
            lastName = itemView.findViewById(R.id.activity_birthday_list_last_name_name);
            myDate = itemView.findViewById(R.id.activity_birthday_list_date);
        }


    }
}
