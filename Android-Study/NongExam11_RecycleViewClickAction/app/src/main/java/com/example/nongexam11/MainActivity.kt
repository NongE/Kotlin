package com.example.nongexam11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberList:List<Int> = (0..100).toList().shuffled()

        val adapter = DataAdapter(numberList)

        adapter.onItemSelectionChangedListener = {
            println("선택된 ID: ${it}")
        }


        integerList.adapter = adapter
        integerList.layoutManager = LinearLayoutManager(this)
    }
}
