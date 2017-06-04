@file:JvmName("ExtensionsUtils")

package com.nghiepnguyen.kedditbynghiep.commons.Extensions

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.nghiepnguyen.kedditbynghiep.R
import com.squareup.picasso.Picasso

/**
 * Created by W10-PRO on 29-May-17.
 */


fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}

fun ImageView.loadImg(imageUrl: String) {
    if (TextUtils.isEmpty(imageUrl))
        Picasso.with(context).load(R.mipmap.ic_launcher).into(this)
    else
        Picasso.with(context).load(imageUrl).into(this)
}