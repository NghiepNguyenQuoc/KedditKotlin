@file:JvmName("ExtensionsUtils")

package com.nghiepnguyen.kedditbynghiep.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by W10-PRO on 29-May-17.
 */


fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}