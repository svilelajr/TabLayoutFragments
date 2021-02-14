package com.example.tablayoutfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FoodFragment(foods: List<Food>) : Fragment() {


    val foods = foods

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

           }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewFood)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = FoodAdapter(foods)
    }

}
