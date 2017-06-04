package com.nghiepnguyen.kedditbynghiep.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.nghiepnguyen.kedditbynghiep.R
import com.nghiepnguyen.kedditbynghiep.commons.Extensions.getFriendlyTime
import com.nghiepnguyen.kedditbynghiep.commons.Extensions.inflate
import com.nghiepnguyen.kedditbynghiep.commons.Extensions.loadImg
import com.nghiepnguyen.kedditbynghiep.commons.RedditNewsItem
import com.nghiepnguyen.kedditbynghiep.commons.adapter.ViewType
import com.nghiepnguyen.kedditbynghiep.commons.adapter.ViewTypeDelegateAdapter
import kotlinx.android.synthetic.main.news_item.view.*

/**
 * Created by W10-PRO on 29-May-17.
 */
class NewsDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            //Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }

    /*override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return NewsViewHolder(parent)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as NewsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    inner class NewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            //Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()

            super.itemView.setOnClickListener { viewActions.onItemSelected(item.url) }
        }
    }*/
}
