package com.example.nongexam4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        photoView.setOnClickListener(object: View.OnClickListener{
            var isDefult = true

            override fun onClick(v: View?) {
                isDefult = !isDefult

                if(isDefult){
                    photoView.setImageResource(R.drawable.img_ex1)
                }else{
                    photoView.setImageResource(R.drawable.img_ex2)

                }

            }
        })

        scaleTypeButton.setOnClickListener(object:View.OnClickListener{

            var isDefult = true

            override fun onClick(v: View?) {
                isDefult = !isDefult

                if(isDefult){
                    photoView.scaleType = ImageView.ScaleType.CENTER_CROP
                }else{
                    photoView.scaleType = ImageView.ScaleType.CENTER_INSIDE

                }



            }

        })

    }
}
