package com.miguel.foodapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.miguel.foodapp.Models.ExtendedIngredient;
import com.miguel.foodapp.R;

import java.util.List;

public class IngredientsAdapter extends RecyclerView.Adapter<IngredientsViewHolder>{
    Context context;
    List<ExtendedIngredient> list;

    public IngredientsAdapter(Context context, List<ExtendedIngredient> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public IngredientsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new IngredientsViewHolder(LayoutInflater.from(context).inflate(R.layout.list_meal_ingredients, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull IngredientsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

class IngredientsViewHolder extends RecyclerView.ViewHolder{
    TextView textView_ingredients_quantity,textView_ingredients_name;
    ImageView imageView_ingredients;

    public IngredientsViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_ingredients_quantity = itemView.findViewById(R.id.textView_ingredients_quantity);
        textView_ingredients_name = itemView.findViewById(R.id.textView_ingredients_name);
        imageView_ingredients = itemView.findViewById(R.id.imageView_ingredients);
    }
}
