package com.example.judyliu.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private ImageButton mFabButton;
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFabButton= (ImageButton) findViewById(R.id.toolbar);
        initToolbar();
        initRecyclerView();
    }

    private void initToolbar() {
        mToolbar= (Toolbar) findViewById(R.id.fabButton);
        setSupportActionBar(mToolbar);
        setTitle(getString(R.string.app_title));
        mToolbar.setTitleTextColor(getResources().getColor(android.R.color.white));

    }


    private void initRecyclerView() {
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        //TODO  ???
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //要写实现类
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter();
        recyclerView.setAdapter(recyclerAdapter);

    }



}
