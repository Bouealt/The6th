package com.example.the6th.recycleView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.the6th.R;

import java.util.ArrayList;

public class RecycleView extends AppCompatActivity {
    RecyclerView revView;
    RecAdapter recAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        initView();
    }

    private void initView() {
        revView = findViewById(R.id.rv_recycle);
        recAdapter = new RecAdapter();
        revView.setAdapter(recAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(RecycleView.this);
        revView.setLayoutManager(linearLayoutManager);
        ArrayList list = new ArrayList();
        for (int i = 0; i < 60; i++) {
            list.add(i);
        }
        recAdapter.setData(list);
        revView.addItemDecoration(new DividerItemDecoration(RecycleView.this, OrientationHelper.VERTICAL));
        revView.setItemAnimator(new DefaultItemAnimator());
    }
}
