package com.example.the6th.recycleView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the6th.R;

import java.util.*;

public class RecAdapter extends RecyclerView.Adapter< RecAdapter.ViewHolder> {
    private ArrayList aDataList;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //利用LayoutInflater来加载item的布局
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycle_view, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        viewHolder.mTextView.setText(aDataList.get(i) + "");

    }

    @Override
    public int getItemCount() {
        if (aDataList != null) {
            return aDataList.size();
        } else {
            return 0;
        }
    }

    public void setData(ArrayList list) {
        aDataList = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_item_text);
        }
    }

}
