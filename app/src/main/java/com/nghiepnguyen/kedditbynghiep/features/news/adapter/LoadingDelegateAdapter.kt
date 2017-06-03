package com.nghiepnguyen.kedditbynghiep.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.nghiepnguyen.kedditbynghiep.R
import com.nghiepnguyen.kedditbynghiep.commons.adapter.ViewType
import com.nghiepnguyen.kedditbynghiep.commons.adapter.ViewTypeDelegateAdapter
import com.nghiepnguyen.kedditbynghiep.commons.inflate

/**
 * Created by W10-PRO on 29-May-17.
 */

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup) = LoadingViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {

    }
}
