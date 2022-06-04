package com.example.a591kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MainAdapter(var context: Context, var list: ArrayList<Main>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var HEAD = 0
    private var FEEDS = 1
    private var STORY = 2


    override fun getItemViewType(position: Int): Int {
        val feeds = list[position]
        if (feeds.isHeaders) {
            return HEAD
        } else if (feeds.feeds!!.size > 0) {
            return FEEDS
        }
        return STORY
    }

    private fun getStoryAdapter(feeds: ArrayList<Feeds>, recyclerView: RecyclerView) {
        val adapter = StoryAdapter(context, feeds)
        recyclerView.adapter = adapter
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == HEAD) {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.head_view, parent, false)
            return HeadViewHolder(view)
        } else if (viewType == FEEDS) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.story_recyclerview, parent, false)
            return FeedsViewHolder(view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.story, parent, false)
        return StorysViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feeds = list[position]

        if (holder is HeadViewHolder) { }

        if (holder is FeedsViewHolder) {
            val recyclerView = holder.recyclerView
            feeds.feeds?.let { getStoryAdapter(it, recyclerView) }
           // getStoryAdapter(feeds.feeds!!,recyclerView)
        }

        if (holder is StorysViewHolder) {
            holder.profile.setImageResource(feeds.story!!.profile)
            holder.tagged.text = feeds.story!!.taggedComment
            holder.story_Fullname_id.text = feeds.story!!.fullname
            holder.story_comment_1_id.text = feeds.story!!.story_comment_1_id
            holder.story_comment_2_id.text = feeds.story!!.story_comment_2_id
            holder.story_fullImageScreen_id.setImageResource(feeds.story!!.story_fullImageScreen_id)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class HeadViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    inner class FeedsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var recyclerView: RecyclerView = itemView.findViewById(R.id.story_recyclerView)

        init {
            recyclerView.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        }
    }

    inner class StorysViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tagged: TextView = itemView.findViewById(R.id.story_comment_tagged_id)
        var profile: ShapeableImageView = itemView.findViewById(R.id.story_profile_id)
        var story_Fullname_id: TextView = itemView.findViewById(R.id.story_Fullname_id)
        var story_comment_1_id: TextView = itemView.findViewById(R.id.story_comment_1_id)
        var story_comment_2_id: TextView = itemView.findViewById(R.id.story_comment_2_id)
        var story_fullImageScreen_id: ImageView =
            itemView.findViewById(R.id.story_fullImageScreen_id)
    }
}