package com.example.ismt_recycler_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyListData.ViewHolder> {

    private MyListData myListData;
    public MyAdapter (MyListData myListData){
        this.myListData= myListData;
    }

    @NonNull
    @Override
    public MyListData.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.list_data)
        return null;
    }



    @Override
    public void onBindViewHolder(@NonNull MyListData.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}


