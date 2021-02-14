package com.example.tablayoutfragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(foodList: List<Food>) : RecyclerView.Adapter<FoodViewHolder>(){

    private var foodList = foodList

        set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent,false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {

        val food = foodList[position]

        val name: TextView = holder.name
        name.text = food.name

        val description: TextView = holder.description
        description.text = food.description

        val price: TextView = holder.price
        price.text = food.price

    }

    override fun getItemCount(): Int {
        return foodList.size

    }



}