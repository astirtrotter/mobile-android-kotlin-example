package com.astir_trotter.ktexample.features.news

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.astir_trotter.ktexample.R
import com.astir_trotter.ktexample.commons.extensions.inflate
import kotlinx.android.synthetic.main.news_fragment.*

/**
 * @author          - Saori Sugiyama
 * @contact         - sugiyama.saori.biz@gmail.com
 * @date            - 5/21/17
 */
class NewsFragment: Fragment() {

    private val newsList by lazy {
        news_list
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.news_fragment)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        newsList.setHasFixedSize(true) // <-- Lazy executed!
        newsList.layoutManager = LinearLayoutManager(context)
    }
}