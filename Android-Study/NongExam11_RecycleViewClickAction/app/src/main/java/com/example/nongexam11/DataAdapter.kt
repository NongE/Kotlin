package com.example.nongexam11

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_integer.view.*

class DataViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer {

}

class DataAdapter(val list: List<Int>) : RecyclerView.Adapter<DataViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_integer, parent, false)
        view.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val id = v?.tag

                if (selectionList.contains(id)) {
                    selectionList.remove(id)
                } else selectionList.add(id as Long)

                notifyDataSetChanged()
                onItemSelectionChangedListener?.let { it(selectionList) }
            }

        })
        return DataViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.containerView.integerText.text = list[position].toString()
        holder.containerView.tag = getItemId(position)
        holder.containerView.isActivated = selectionList.contains(getItemId(position))


    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    val selectionList = mutableListOf<Long>()
    var onItemSelectionChangedListener: ((MutableList<Long>) -> Unit)? = null
}