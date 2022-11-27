package com.example.fruitshop.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fruitshop.DetailActivity;
import com.example.fruitshop.R;
import enity.Fruit;

import java.io.Serializable;
import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
    private List<Fruit> list;

    public FruitAdapter(List<Fruit> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final  View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra("myposition",(Serializable)list.get(position));
                view.getContext().startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Fruit fruit = list.get(position);
        holder.fruitImg.setImageResource(fruit.getImgId());
        holder.fruitName.setText(fruit.getName());
        holder.fruitIntroduce.setText(fruit.getIntroduce());
        holder.fruitPrice.setText(fruit.getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        View fruitView;
        ImageView fruitImg;
        TextView fruitName;
        TextView fruitIntroduce;
        TextView fruitPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fruitImg = itemView.findViewById(R.id.fruitImg);
            fruitView = itemView;
            fruitName = itemView.findViewById(R.id.fruitName);
            fruitIntroduce = itemView.findViewById(R.id.fruitIntroduce);
            fruitPrice = itemView.findViewById(R.id.fruitPrice);
        }
    }
}
