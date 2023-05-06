package com.example.houserentappproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    Context context;

    ArrayList<House> list;

    public MyAdapter(Context context, ArrayList<House> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        House house = list.get(position);
        holder.name.setText(house.getName());
        holder.number.setText(house.getNumber());
        holder.type.setText(house.getType());
        holder.rent.setText(house.getRent());
        holder.city.setText(house.getCity());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{


        TextView name, number, type, rent, city;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.ownernametv);
            number = itemView.findViewById(R.id.ownernumbertv);
            name = itemView.findViewById(R.id.housetypetv);
            name = itemView.findViewById(R.id.rentamounttv);
            name = itemView.findViewById(R.id.citytv);
        }
    }
}
