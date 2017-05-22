package com.astir_trotter.ktexample.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.astir_trotter.ktexample.R
import com.astir_trotter.ktexample.commons.adapter.ViewType
import com.astir_trotter.ktexample.commons.adapter.ViewTypeDelegateAdapter
import com.astir_trotter.ktexample.commons.extensions.inflate

/**
 * @author          - Saori Sugiyama
 * @contact         - sugiyama.saori.biz@gmail.com
 * @date            - 5/22/17
 */
class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.news_item_loading)) {

    }

}