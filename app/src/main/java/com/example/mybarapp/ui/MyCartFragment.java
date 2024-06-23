package com.example.mybarapp.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mybarapp.R;
import com.example.mybarapp.adapters.CartAdapter;
import com.example.mybarapp.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list = new ArrayList<>();

        list.add(new CartModel(R.drawable.beer,"Heineken","LKR 750","4.5"));
        list.add(new CartModel(R.drawable.vodka3,"Absolut Vodka","LKR 21,750","4.9"));
        list.add(new CartModel(R.drawable.beer2,"Kotsberg","LKR 950","4.5"));
        list.add(new CartModel(R.drawable.rum2,"Chai Rum","LKR 12,750","4.8"));

        cartAdapter = new CartAdapter(list);

        recyclerView.setAdapter(cartAdapter);


        return view;
    }
}