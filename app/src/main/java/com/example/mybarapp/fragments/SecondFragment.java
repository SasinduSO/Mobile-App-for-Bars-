package com.example.mybarapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mybarapp.R;
import com.example.mybarapp.adapters.FeaturedAdapter;
import com.example.mybarapp.adapters.FeaturedVerAdapter;
import com.example.mybarapp.models.FeaturedModel;
import com.example.mybarapp.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {


    /////////// Featured Hor RecyclerView
    List<FeaturedModel> featuredModelsList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    /////////// Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;


    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);

        /////////// Featured Hor RecyclerView
        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));

        featuredModelsList = new ArrayList<>();

        featuredModelsList.add(new FeaturedModel(R.drawable.feat2));
        featuredModelsList.add(new FeaturedModel(R.drawable.feat3));
        featuredModelsList.add(new FeaturedModel(R.drawable.feat4));

        featuredAdapter = new FeaturedAdapter(featuredModelsList);
        recyclerView.setAdapter(featuredAdapter);

        /////////// Featured Ver RecyclerView
        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        featuredVerModelList = new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.whiskey1,"Jack Daniels","750ml | 40% ABV","4.9"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.beer,"Heineken","330ml | 5% ABV","4.7"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.beer4,"Corona Extra","335ml | 4.60%","4.5"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.vodka3,"Absolut Vodka","750 ml | 40% ABV","4.9"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.rum3,"DON Q RESERVA 7","750ml | 40% ABV","4.7"));



        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);


        return  view;
    }
}