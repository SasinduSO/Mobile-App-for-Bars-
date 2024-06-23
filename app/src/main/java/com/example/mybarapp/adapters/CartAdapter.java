package com.example.mybarapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mybarapp.R;
import com.example.mybarapp.models.CartModel;

import java.util.List;


// Adapter for the RecyclerView in the shopping cart
public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {


    // List to hold the data for the cart items
    List<CartModel> list;


    // List to hold the data for the cart items
    public CartAdapter(List<CartModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    // Called when RecyclerView needs a new ViewHolder of the given type to represent an item
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Inflates the layout for each item in the RecyclerView
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.mycart_item,parent,false));
    }




    @Override
    // Called to display the data at the specified position
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {

        // Bind data to the ViewHolder
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.rating.setText(list.get(position).getRating());
        holder.price.setText(list.get(position).getPrice());

    }

    @Override
    // Returns the total number of items in the data set
    public int getItemCount() {
        return 0;
    }

    // ViewHolder class to hold references to the views for each item in the RecyclerView
    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,rating,price;

        // Constructor to initialize the views in the ViewHolder
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.detailed_img);
            name = itemView.findViewById(R.id.detailed_name);
            rating = itemView.findViewById(R.id.detailed_rating);
            price = itemView.findViewById(R.id.detailed_price);
        }
    }
}
