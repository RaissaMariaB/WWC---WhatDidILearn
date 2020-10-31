package com.wwc.whatdidilearn.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import  androidx.recyclerview.widget.RecyclerView
import com.wwc.whatdidilearn.R
import com.wwc.whatdidilearn.entities.ItemLearned


class LearnedItemsAdapter: RecyclerView.Adapter<LearnedItemsAdapter.LearnedItemViewHolder>() {
    var data = listOf<ItemLearned>()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    inner class LearnedItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val titleItem: TextView = itemView.findViewById(R.id.item_title)
    val descriptionItem: TextView = itemView.findViewById(R.id.item_description)
    val levelItem: View = itemView.findViewById(R.id.item_level)

    fun bind(title: String, description: String, color: Int ) {
        titleItem.text = title
        descriptionItem.text = description
        levelItem.setBackgroundResource(color)
    }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnedItemViewHolder {
        val layoutInflater: LayoutInflater  = LayoutInflater.from(parent.context)
        val itemView: View = layoutInflater.inflate(R.layout.item_learned, parent, false)
        return LearnedItemViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: LearnedItemViewHolder, position: Int) {
       val learnedItemViewHolder: ItemLearned = data.get(position)
        holder.bind(learnedItemViewHolder.description, learnedItemViewHolder.title, learnedItemViewHolder.understandingLevel.color)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
