package com.example.nongexam3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        inputButton.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {

                if(nameEdit.text.isNullOrBlank()){
                    greetText.text = "아이디가 입력되지 않았습니다"
                }else{
                    greetText.text = "${nameEdit.text}님 반갑습니다"
                }

            }

        })
    }
}
