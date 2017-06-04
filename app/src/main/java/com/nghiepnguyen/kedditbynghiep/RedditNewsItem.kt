package com.nghiepnguyen.kedditbynghiep

import com.nghiepnguyen.kedditbynghiep.commons.adapter.AdapterConstants
import com.nghiepnguyen.kedditbynghiep.commons.adapter.ViewType

/**
 * Created by W10-PRO on 03-Jun-17.
 */
data class RedditNewsItem(var author: String, var title: String, val numComments: Int, val created: Long, val thumbnail: String, var url: String): ViewType{
    override fun getViewType()= AdapterConstants.NEWS
}