package com.initishbhatt.marvelsuperheros.util

import android.databinding.BindingAdapter
import android.databinding.BindingConversion
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * @author nitishbhatt
 */


@BindingAdapter("android:src")
fun setImageUrl(view: ImageView, url: String) {
    Picasso.with(view.context).load(url).into(view)
}

@BindingConversion
fun convertBooleanToVisibility(visible: Boolean): Int {
    return if (visible) View.VISIBLE else View.GONE
}
