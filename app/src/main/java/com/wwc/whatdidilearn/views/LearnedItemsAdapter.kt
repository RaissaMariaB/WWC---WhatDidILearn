package com.wwc.whatdidilearn.views

import android.icu.text.CaseMap
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import  androidx.recyclerview.widget.RecyclerView
import com.wwc.whatdidilearn.R
import com.wwc.whatdidilearn.entities.ItemLearned
import kotlinx.android.synthetic.main.item_learned.view.*
import java.io.FileDescriptor

class LearnedItemsAdapter: RecyclerView.Adapter<LearnedItemsAdapter.LearnedItemViewHolder>() {
    var data = listOf<ItemLearned>()

    inner class LearnedItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val titleItem: TextView = itemView.findViewById(R.id.item_title)
    val descriptionItem: TextView = itemView.findViewById(R.id.item_description)
    val levelItem: TextView = itemView.findViewById(R.id.item_level)

    fun bind(title: String, description: String, color: Int ) {
        titleItem.text = title
        descriptionItem.text = description
        levelItem.setBackgroundResource(color)
    }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnedItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: LearnedItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}