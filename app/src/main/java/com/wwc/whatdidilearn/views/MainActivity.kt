package com.wwc.whatdidilearn.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.wwc.whatdidilearn.R
import com.wwc.whatdidilearn.data.DataBaseItem
import com.wwc.whatdidilearn.entities.ItemLearned

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.items_recycle_view)
        val adapter = LearnedItemsAdapter()
        recyclerView.adapter = adapter


        val learnedItemsList: List<ItemLearned> = DataBaseItem().getAll()
        adapter.data = learnedItemsList

    }
}