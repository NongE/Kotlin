package com.example.nongexam10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catList = listOf(
            SampleModel(R.drawable.image_1,"고양1"),
            SampleModel(R.drawable.image_2,"고양2"),
            SampleModel(R.drawable.image_3,"고양3"),
            SampleModel(R.drawable.image_4,"고양4"),
            SampleModel(R.drawable.image_5,"고양5"),
            SampleModel(R.drawable.image_6,"고양6")
        )

        var adapter = SampleDataAdapter(catList,R.layout.item_box_3)
        sampleListView.adapter = adapter
        //sampleListView.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)//마지막falsd는 순서를 뒤집을지
        //sampleListView.layoutManager = GridLayoutManager(this,2)
        sampleListView.layoutManager = StaggeredGridLayoutManager(2,RecyclerView.VERTICAL)

    }
}
