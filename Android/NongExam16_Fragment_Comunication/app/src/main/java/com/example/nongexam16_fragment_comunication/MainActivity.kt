package com.example.nongexam16_fragment_comunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contentFrame,ContentFragment())
        transaction.commit()

        sendButton.setOnClickListener(View.OnClickListener {

            val fragment = supportFragmentManager.findFragmentById(R.id.contentFrame)

            if(fragment is ContentFragment){
                fragment.setActivityText(inputText.text.toString())
            }


        })


    }

    override fun onAttachFragment(fragment: Fragment?) {
        super.onAttachFragment(fragment)

        if(fragment is ContentFragment){

            fragment.onInputTextListener = object : ContentFragment.OnInputTextListener{
                override fun onInputText(text: String?) {
                    fragmentText.text = text
                }

            }

        }
    }
}
