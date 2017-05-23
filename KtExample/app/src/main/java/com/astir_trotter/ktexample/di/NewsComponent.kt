package com.astir_trotter.ktexample.di

import com.astir_trotter.ktexample.features.news.NewsFragment
import dagger.Component
import javax.inject.Singleton

/**
 * @author          - Saori Sugiyama
 * @contact         - sugiyama.saori.biz@gmail.com
 * @date            - 5/23/17
 */

@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        NewsModule::class,
        NetworkModule::class)
)
interface NewsComponent {

    fun inject(newsFragment: NewsFragment)

}