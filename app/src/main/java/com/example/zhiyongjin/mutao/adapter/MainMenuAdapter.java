package com.example.zhiyongjin.mutao.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.List;

public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuViewHolder> {

    protected Context context;
    protected List<Menu> list;
    public MainMenuAdapter(Context context, List<Menu> menus){

        this.context=context;
        this.list = menus;
    }


    @NonNull
    @Override
    public MainMenuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MainMenuViewHolder();
    }

    @Override
    public void onBindViewHolder(@NonNull MainMenuViewHolder mainMenuViewHolder, int i) {

    }


    @Override
    public int getItemCount() {
        return null!=list?list.size():0;
    }
}

class MainMenuViewHolder extends RecyclerView.ViewHolder{

    public MainMenuViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
