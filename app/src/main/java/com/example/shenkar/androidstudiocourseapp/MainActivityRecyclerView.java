package com.example.shenkar.androidstudiocourseapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

public class MainActivityRecyclerView extends RecyclerView.Adapter<MainActivityRecyclerView.ViewHolder> {

    private List<MainActivityListItem> btnNameList;
    private Context context;
    private MainAppBtnPressred mainAppBtnPressred;

    public MainActivityRecyclerView(Context context, List<MainActivityListItem> btnNameList, MainAppBtnPressred mainAppBtnPressred) {
        this.context = context;
        this.btnNameList = btnNameList;
        this.mainAppBtnPressred = mainAppBtnPressred;
    }
    /*
     * This Method will create an instance of ViewHolder
     * */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Log.d(AppSettings.TAG , "onCreateViewHolder: MainActivityRecyclerView");
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_activity_item_list ,parent ,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    /*
    * This method will be called after onCreateViewHolder will called
    * */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(AppSettings.TAG , "onBindViewHolder MainActivityRecyclerView");
        holder.btnApp.setText(btnNameList.get(position).getBtnName());
        holder.btnApp.setId(btnNameList.get(position).getBtnId());
        holder.btnApp.setOnClickListener(mainAppBtnPressred);
        Log.d(AppSettings.TAG , "onBindViewHolder " + btnNameList.get(position).getBtnName() + btnNameList.get(position).getBtnId());
    }


    @Override
    public int getItemCount() {
        Log.d(AppSettings.TAG , "getItemCount MainActivityRecyclerView");
        return btnNameList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        Button btnApp;

        public ViewHolder(View itemView) {
            super(itemView);
            Log.d(AppSettings.TAG , "ViewHolder MainActivityRecyclerView ViewHolder");

            btnApp = itemView.findViewById(R.id.main_activity_list_button);
        }
    }
}
