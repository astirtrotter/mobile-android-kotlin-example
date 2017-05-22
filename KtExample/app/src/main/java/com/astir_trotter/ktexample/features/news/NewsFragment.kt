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

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = container?.inflate(R.layout.news_fragment, true)

        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)

        return view
    }

}