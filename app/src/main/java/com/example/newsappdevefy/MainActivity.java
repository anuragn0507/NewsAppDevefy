package com.example.newsappdevefy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.newsappdevefy.topheadlines.TopHeadlinesAdapter;
import com.example.newsappdevefy.topheadlines.TopHeadlinesModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView topHeadlinesRecyclerView;
    private TopHeadlinesAdapter topHeadlinesAdapter;
    private List<TopHeadlinesModel> topHeadlinesModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topHeadlinesRecyclerView= findViewById(R.id.top_headlines_recyclerview);

        topHeadlinesModelList.add(new TopHeadlinesModel("Gift Guide: The smart home starter kit","How to connect and automate your home without breaking the bank.","TechCrunch"));
        topHeadlinesModelList.add(new TopHeadlinesModel("Gift Guide: The smart home starter kit","How to connect and automate your home without breaking the bank.","TechCrunch"));
        topHeadlinesModelList.add(new TopHeadlinesModel("Gift Guide: The smart home starter kit","How to connect and automate your home without breaking the bank.","TechCrunch"));
        topHeadlinesModelList.add(new TopHeadlinesModel("Gift Guide: The smart home starter kit","How to connect and automate your home without breaking the bank.","TechCrunch"));
        topHeadlinesModelList.add(new TopHeadlinesModel("Gift Guide: The smart home starter kit","How to connect and automate your home without breaking the bank.","TechCrunch"));
        topHeadlinesModelList.add(new TopHeadlinesModel("Gift Guide: The smart home starter kit","How to connect and automate your home without breaking the bank.","TechCrunch"));
        topHeadlinesModelList.add(new TopHeadlinesModel("Gift Guide: The smart home starter kit","How to connect and automate your home without breaking the bank.","TechCrunch"));
        topHeadlinesModelList.add(new TopHeadlinesModel("Gift Guide: The smart home starter kit","How to connect and automate your home without breaking the bank.","TechCrunch"));
        topHeadlinesModelList.add(new TopHeadlinesModel("Gift Guide: The smart home starter kit","How to connect and automate your home without breaking the bank.","TechCrunch"));

        topHeadlinesAdapter = new TopHeadlinesAdapter(topHeadlinesModelList,this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        topHeadlinesRecyclerView.setLayoutManager(layoutManager);
        topHeadlinesRecyclerView.setAdapter(topHeadlinesAdapter);
        topHeadlinesAdapter.notifyDataSetChanged();


    }
}