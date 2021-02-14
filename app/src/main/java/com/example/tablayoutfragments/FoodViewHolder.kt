package com.example.tablayoutfragments

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val name: TextView by lazy {view.findViewById<TextView>(R.id.tv_food_name)}
    val description: TextView by lazy {view.findViewById<TextView>(R.id.tv_food_description)}
    val price: TextView by lazy {view.findViewById<TextView>(R.id.tv_food_price)}


}