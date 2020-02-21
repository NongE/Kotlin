package com.example.nongexam13_activitychange

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val intent = getIntent()
        extraText.text = intent.getStringExtra("MESSAGE")
        // 원본 자료형 맞춰서 가져오기

        okButton.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {

                val intent = Intent()
                intent.putExtra("MESSAGE","다시 돌아왔습니다")

                setResult(Activity.RESULT_OK, intent)

                finish() // 현재 액티비티를 종료, 이전 액티비티로 돌아감
            }

        })



    }
}
