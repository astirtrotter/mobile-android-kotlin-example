package com.astir_trotter.ktexample.commons

import android.os.Parcel
import android.os.Parcelable
import com.astir_trotter.ktexample.commons.adapter.AdapterConstants
import com.astir_trotter.ktexample.commons.adapter.ViewType

/**
 * @author          - Saori Sugiyama
 * @contact         - sugiyama.saori.biz@gmail.com
 * @date            - 5/22/17
 */
data class RedditNews(
        val after: String,
        val before: String,
        val news: List<RedditNewsItem>)

data class RedditNewsItem(var author: String,
                          var title: String,
                          var numComments: Int,
                          var created: Long,
                          var thumbnail: String,
                          var url: String?) : ViewType, Parcelable {

    override fun getViewType() = AdapterConstants.NEWS

    companion object {
        @JvmField val CREATOR: Parcelable.Creator<RedditNewsItem> = object : Parcelable.Creator<RedditNewsItem> {
            override fun createFromParcel(source: Parcel): RedditNewsItem = RedditNewsItem(source)
            override fun newArray(size: Int): Array<RedditNewsItem?> = arrayOfNulls(size)
        }
    }

    constructor(source: Parcel) : this(source.readString(), source.readString(), source.readInt(), source.readLong(), source.readString(), source.readString())

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(author)
        dest?.writeString(title)
        dest?.writeInt(numComments)
        dest?.writeLong(created)
        dest?.writeString(thumbnail)
        dest?.writeString(url)
    }

    override fun describeContents(): Int = 0

}