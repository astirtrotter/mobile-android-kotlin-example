package com.astir_trotter.ktexample.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.astir_trotter.ktexample.R
import com.astir_trotter.ktexample.commons.RedditNewsItem
import com.astir_trotter.ktexample.commons.adapter.ViewType
import com.astir_trotter.ktexample.commons.adapter.ViewTypeDelegateAdapter
import com.astir_trotter.ktexample.commons.extensions.getFriendlyTime
import com.astir_trotter.ktexample.commons.extensions.inflate
import com.astir_trotter.ktexample.commons.extensions.loadImg
import kotlinx.android.synthetic.main.news_item.view.*

/**
 * @author          - Saori Sugiyama
 * @contact         - sugiyama.saori.biz@gmail.com
 * @date            - 5/22/17
 */
class NewsDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            //Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }

}