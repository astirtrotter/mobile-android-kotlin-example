package com.astir_trotter.ktexample.di.news

import com.astir_trotter.ktexample.di.AppModule
import com.astir_trotter.ktexample.di.NetworkModule
import com.astir_trotter.ktexample.features.news.NewsFragment

/**
 * @author          - Saori Sugiyama
 * @contact         - sugiyama.saori.biz@gmail.com
 * @date            - 5/23/17
 */

@javax.inject.Singleton
@dagger.Component(modules = arrayOf(
        AppModule::class,
        NewsModule::class,
        NetworkModule::class)
)
interface NewsComponent {

    fun inject(newsFragment: NewsFragment)

}