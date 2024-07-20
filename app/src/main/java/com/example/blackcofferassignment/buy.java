package com.example.blackcofferassignment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class buy extends Fragment {

    public buy() {
    }

    private RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_buy, container, false );

        RecyclerView recyclerView=view.findViewById(R.id.recyclerView);


        ArrayList<Item> i = new ArrayList<>();
        i.add(new Item("Home Theatre Complete Set", "Pepperfry", "690 USD"," Huston,Texas", R.drawable.i1));
        i.add(new Item("Bed Set", "Amazon", "500 USD"," Huston,Texas", R.drawable.i2));
        i.add(new Item("Sofa Set", "Flipkart", "800 USD"," Huston,Texas", R.drawable.i3));
        i.add(new Item("Dining Set", "Pepperfry", "300 USD"," Huston,Texas", R.drawable.i4));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(new CustomAdaptor(i));
        return view;
    }
}