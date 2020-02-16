package com.example.nongexam8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    var numberList = mutableListOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,numberList)

        numberOption.adapter = adapter

        numberOption.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                notifyText.setText("${numberList[position]}이 선택되었습니다!")
            }

        }



        addButton.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                numberList.add(Random.nextInt(0..100))
                numberList.sort()
                adapter.notifyDataSetChanged()

            }

        })

        removeButton.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                if(numberList.isNotEmpty()){
                    numberList.removeAt(0)
                    adapter.notifyDataSetChanged()
                }
            }

        })


    }
}
