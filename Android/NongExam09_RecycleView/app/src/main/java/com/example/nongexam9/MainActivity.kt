package com.example.nongexam9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val foodList: List<FoodModel> = listOf(
            FoodModel("김밥",2500),
            FoodModel("라면",3500),
            FoodModel("떡볶이",4000),
            FoodModel("라볶이",5000),
            FoodModel("떡볶이",4000),
            FoodModel("라볶이",5000),
            FoodModel("떡볶이",4000),
            FoodModel("라볶이",5000),
            FoodModel("떡볶이",4000),
            FoodModel("라볶이",5000),
            FoodModel("떡볶이",4000),
            FoodModel("라볶이",5000),
            FoodModel("떡볶이",4000),
            FoodModel("라볶이",5000),
            FoodModel("돈까스",7000)
        )

        val adapter = FoodDataAdapter(foodList)

        foodListView.adapter = adapter
        foodListView.layoutManager = LinearLayoutManager(this)
    }
}
