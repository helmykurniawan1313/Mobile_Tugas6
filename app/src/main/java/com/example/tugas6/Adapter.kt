package com.example.tugas6

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import kotlinx.android.synthetic.main.list.view.*
import kotlinx.android.synthetic.main.detail_activity.view.*
import kotlinx.android.synthetic.main.list.view.*

class Adapter (val ItemList: List<Data>, val clickListener:(Data) -> Unit ) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val  view = inflater.inflate(R.layout.list, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(ItemList[position], clickListener)
    }

    override fun getItemCount() = ItemList.size

    class PartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(food:Data, clickListener: (Data) -> Unit) {
            itemView.tv_nama_list.text = food.nama
            itemView.setOnClickListener {clickListener(food)}
        }

    }
}