package com.example.nongexam13_activitychange

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveButton.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                println("버튼이 눌림")
                val intent = Intent(applicationContext,SubActivity::class.java)
                intent.putExtra("MESSAGE","MainActivity에서 왔습니다.")
                //startActivity(intent)
                startActivityForResult(intent,1234)

            }



        })
    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if(requestCode == 1234 && resultCode == Activity.RESULT_OK) {
            messageText.text = data?.getStringExtra("MESSAGE")
        }else{
            messageText.text = "돌아오긴 했습니다."
        }
    }
}
