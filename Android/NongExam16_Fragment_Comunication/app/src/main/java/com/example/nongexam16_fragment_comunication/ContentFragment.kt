package com.example.nongexam16_fragment_comunication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_content.*

/**
 * A simple [Fragment] subclass.
 */
class ContentFragment : Fragment() {

    interface OnInputTextListener{
        fun onInputText(text:String?)
    }

    var onInputTextListener: OnInputTextListener? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_content, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        confirmButton.setOnClickListener(View.OnClickListener {
            onInputTextListener?.onInputText("확인되었습니다.")
        })

    }

    fun setActivityText(text: String?){
        activityText.text= text
    }


}
