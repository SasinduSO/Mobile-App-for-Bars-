package com.example.mybarapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mybarapp.R;
import com.example.mybarapp.models.HomeHorModel;
import com.example.mybarapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.vodka1, "Vodka", "4.9", "LKR 9,100"));
            homeVerModels.add(new HomeVerModel(R.drawable.vodka2, "POPOV", "4.5", "LKR 39,100"));
            homeVerModels.add(new HomeVerModel(R.drawable.vodka3, "Absolut Vodka", "4.9", "LKR 13,100"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();

                if (position == 0) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.vodka1, "Vodka", "4.9", "LKR 9,100"));
                    homeVerModels.add(new HomeVerModel(R.drawable.vodka2, "POPOV", "4.5", "LKR 39,100"));
                    homeVerModels.add(new HomeVerModel(R.drawable.vodka3, "Absolut Vodka", "4.9", "LKR 13,100"));

                    updateVerticalRec.callBack(position, homeVerModels);
                } else if (position == 1) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.rum1, "Pitbull Rum", "4.9", "LKR 29,100"));
                    homeVerModels.add(new HomeVerModel(R.drawable.rum2, "Chai Rum", "4.5", "LKR 31,100"));
                    homeVerModels.add(new HomeVerModel(R.drawable.rum3, "DON Q", "4.9", "LKR 53,100"));
                } else if (position == 2) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.rum1, "Pitbull Rum", "4.9", "LKR 29,100"));
                    homeVerModels.add(new HomeVerModel(R.drawable.rum2, "Chai Rum", "4.5", "LKR 31,100"));
                    homeVerModels.add(new HomeVerModel(R.drawable.rum3, "DON Q", "4.9", "LKR 53,100"));
                } else if (position == 3) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.brandy1, "Remy Martin XO", "4.9", "LKR 40,000"));
                    homeVerModels.add(new HomeVerModel(R.drawable.brandy2, "Carlos.I", "4.5", "LKR 11,100"));
                    homeVerModels.add(new HomeVerModel(R.drawable.brandy3, "McDowells", "4.9", "LKR 60,000"));
                } else if (position == 4) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.beer2, "Kotsberg", "4.9", "LKR 1,100"));
                    homeVerModels.add(new HomeVerModel(R.drawable.beer3, "Lion Stout", "4.5", "LKR 1,000"));
                    homeVerModels.add(new HomeVerModel(R.drawable.beer4, "Corona Extra", "4.9", "LKR 2,100"));
                } else if (position == 5) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.whiskey1, "Jack Daniels", "4.9", "LKR 15,100"));
                    homeVerModels.add(new HomeVerModel(R.drawable.whiskey2, "Maker's Mark", "4.5", "LKR 51,000"));
                    homeVerModels.add(new HomeVerModel(R.drawable.whiskey3, "JIM BEAM", "4.9", "LKR 25,100"));
                }
            }
        });

        if (select) {
            if (position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
                select = false;
            }
        } else {
            if (row_index == position) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
            } else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg);
            }
        }
    }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
