package com.example.a591kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class StoryAdapter(var context: Context, var list: ArrayList<Feeds>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var CREATE = 0
    private var FEEDS = 1

    override fun getItemViewType(position: Int): Int {
        if (isHeader(position))
            return CREATE
        return FEEDS
    }

    private fun isHeader(position: Int): Boolean {
        return position == 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == CREATE) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.create, parent, false)
            return CreateViewHolder(view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.feeds, parent, false)
        return FeedsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feeds = list[position]
        if (holder is CreateViewHolder) {
        }
        if (holder is FeedsViewHolder) {
            holder.mainPic.setImageResource(feeds.mainPhoto)
            holder.roundedPic.setImageResource(feeds.roundedPhoto)
            holder.text.text = feeds.text
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class CreateViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    inner class FeedsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mainPic: ShapeableImageView = itemView.findViewById(R.id.feeds_fullImage_id)
        var roundedPic: ShapeableImageView = itemView.findViewById(R.id.feeds_roundedImage_id)
        var text: TextView = itemView.findViewById(R.id.feeds_textFullname_id)
    }
}