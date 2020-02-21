package com.example.nongexam6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var nameArray = arrayOf("홍길동","김이박","갑을병정")

    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetText.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                greetText.setText("문구를 클릭하였습니다.")
            }

        })

        adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,nameArray)

        nameOption.adapter = adapter

        nameOption.onItemSelectedListener= object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                greetText.setText("${nameArray[position]}님 반갑습니다!")
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }

    }
}
