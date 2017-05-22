package com.astir_trotter.ktexample.commons

/**
 * @author          - Saori Sugiyama
 * @contact         - sugiyama.saori.biz@gmail.com
 * @date            - 5/22/17
 */

data class RedditNewsItem(var thumbnail: String,
                          var author: String,
                          var title: String,
                          var numComments: Int,
                          var created: Long)