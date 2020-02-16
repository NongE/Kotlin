package com.example.nongexam10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_box_1.view.*

class SampleDataAdapter(val list: List<SampleModel>, val layoutId: Int) :
    RecyclerView.Adapter<SampleDataViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleDataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
        return SampleDataViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: SampleDataViewHolder, position: Int) {
        holder.containerView.sampleImage.setImageResource(list[position].imageId)
        holder.containerView.descriptionText.setText(list[position].description)
    }

}