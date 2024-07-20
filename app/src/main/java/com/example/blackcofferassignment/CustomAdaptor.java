package com.example.blackcofferassignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdaptor extends RecyclerView.Adapter<CustomAdaptor.myViewHolder> {

    ArrayList<Item> itemArrayList;

    public CustomAdaptor(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.card_layout,parent,false);

        return new myViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        Item i = itemArrayList.get(position);

        myViewHolder h = holder;

        h.t1.setText(i.getTitle());
        h.t2.setText(i.getDesc());
        h.t3.setText(i.getPrice());
        h.t4.setText(i.getLocation());
        h.i1.setImageResource(i.getImage());
    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        TextView t1,t2,t3,t4;
        ImageView i1;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            t1 = itemView.findViewById(R.id.itemTitle);
            t2 = itemView.findViewById(R.id.itemDesc);
            t3 = itemView.findViewById(R.id.itemPrice);
            t4 = itemView.findViewById(R.id.itemLocation);
            i1 = itemView.findViewById(R.id.itemImage);
        }
    }

}
