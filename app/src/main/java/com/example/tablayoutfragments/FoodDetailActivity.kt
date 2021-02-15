package com.example.tablayoutfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class FoodDetailActivity : AppCompatActivity() {

    val tvFoodName by lazy { findViewById<TextView>(R.id.tv_food_name_detail) }
    val tvFoodDescription by lazy { findViewById<TextView>(R.id.tv_food_description_detail) }
    val tvFoodPrice by lazy { findViewById<TextView>(R.id.tv_food_price_detail) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        val info = intent.extras

        if(info != null){

            val foodName = info.getString("NAME")
            val foodDescription = info.getString("DESCRIPTION")
            val foodPrice = info.getString("PRICE")

            tvFoodName.text = foodName
            tvFoodDescription.text = foodDescription
            tvFoodPrice.text = foodPrice
        }else{
            Toast.makeText(this, "Erro ao carregar comida", Toast.LENGTH_LONG).show()
        }
    }
}