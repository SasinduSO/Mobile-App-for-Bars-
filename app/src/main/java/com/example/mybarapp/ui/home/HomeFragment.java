package com.example.mybarapp.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mybarapp.R;
import com.example.mybarapp.adapters.HomeHorAdapter;
import com.example.mybarapp.adapters.HomeVerAdapter;
import com.example.mybarapp.adapters.UpdateVerticalRec;
import com.example.mybarapp.models.HomeHorModel;
import com.example.mybarapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateVerticalRec {

    RecyclerView homeHorizontalRec, homeVerticalRec;
    ArrayList <HomeHorModel> homeHorModelsList;
    HomeHorAdapter homeHorAdapter;

    /////Vertical
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;


    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home,container,false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);

        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        /////////Horizontal RecyclerView

        homeHorModelsList = new ArrayList<>();

        homeHorModelsList.add(new HomeHorModel(R.drawable.vodka3,"Vodka"));
        homeHorModelsList.add(new HomeHorModel(R.drawable.rum,"Rum"));
        homeHorModelsList.add(new HomeHorModel(R.drawable.brandy,"Brandy"));
        homeHorModelsList.add(new HomeHorModel(R.drawable.beer,"Beer"));
        homeHorModelsList.add(new HomeHorModel(R.drawable.whiskey,"Whiskey"));

        homeHorAdapter = new HomeHorAdapter(this,getActivity(),homeHorModelsList);

        homeHorizontalRec.setAdapter(homeHorAdapter);

        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));

        homeHorizontalRec.setHasFixedSize(true);

        homeHorizontalRec.setNestedScrollingEnabled(false);

        /////////Vertical RecyclerView
        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);

        homeVerticalRec.setAdapter(homeVerAdapter);

        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));

        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {
        homeVerAdapter = new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);

    }
}