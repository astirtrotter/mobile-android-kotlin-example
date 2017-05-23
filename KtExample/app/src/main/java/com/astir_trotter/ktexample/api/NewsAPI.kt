package com.astir_trotter.ktexample.api

import retrofit2.Call

/**
 * @author          - Saori Sugiyama
 * @contact         - sugiyama.saori.biz@gmail.com
 * @date            - 5/23/17
 */
interface NewsAPI {

    fun getNews(after: String, limit: String): Call<RedditNewsResponse>

}