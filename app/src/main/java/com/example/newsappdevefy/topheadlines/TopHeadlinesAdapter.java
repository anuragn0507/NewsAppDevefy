package com.example.newsappdevefy.topheadlines;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsappdevefy.R;

import java.util.List;

public class TopHeadlinesAdapter extends RecyclerView.Adapter<TopHeadlinesAdapter.Viewholder> {
    public TopHeadlinesAdapter(List<TopHeadlinesModel> topHeadlinesModelList, Context context) {
        this.topHeadlinesModelList = topHeadlinesModelList;
        this.context = context;
    }

    List<TopHeadlinesModel> topHeadlinesModelList;
    Context context;

    @NonNull
    @Override
    public TopHeadlinesAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_headlines_item_layout,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopHeadlinesAdapter.Viewholder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return topHeadlinesModelList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private TextView title, desp, source;


        public Viewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.top_headlines);
            desp=itemView.findViewById(R.id.description);
            source=itemView.findViewById(R.id.source);
        }
    }
    }

