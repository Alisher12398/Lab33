package com.android.lab3

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.TextView
import kotlinx.android.synthetic.main.category_layout.view.*

class CategoryAdapter(var persons:ArrayList<CategoryModel>):RecyclerView.Adapter<CategoryAdapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = persons[position].title

    }

    override fun onCreateViewHolder(holder: ViewGroup, position: Int): ViewHolder {
        val inflater = LayoutInflater.from(holder.context)
        val view = inflater.inflate(R.layout.category_layout, holder, false)
        return ViewHolder(view)
    }
    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun getItemCount(): Int {
        return persons.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var title: TextView = itemView.primary_text
    }
}