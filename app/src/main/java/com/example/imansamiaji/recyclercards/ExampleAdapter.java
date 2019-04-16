package com.example.imansamiaji.recyclercards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {


    //6.2
    private ArrayList<Exampleitem> mExampleList;


      // 1 Create Class
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        //4
          public ImageView imageView;
          public TextView textView;
          //2 Constructor
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            //4
            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);
        }
    }

    //6.1
    public ExampleAdapter(ArrayList<Exampleitem> examplelist) {
        mExampleList=examplelist;


    }


   // 3 Generate methods
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        //5
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item,parent,false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        return exampleViewHolder;

    }

    @Override
    public void onBindViewHolder( @NonNull ExampleViewHolder exampleViewHolder, int i) {

        //7
        Exampleitem currentItem = mExampleList.get(i);
        exampleViewHolder.imageView.setImageResource(currentItem.getmImageResource());
        exampleViewHolder.textView.setText(currentItem.getmText());

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }


}
