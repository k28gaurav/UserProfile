package com.gallery.app.ui.adapter

import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.gallery.app.base.BaseViewHolder
import com.gallery.app.data.db.entities.Item
import kotlinx.android.synthetic.main.all_item_adapter.view.iv_item

class AllItemsViewHolder(val view: View, val onClick : (position:Int) -> Unit): BaseViewHolder<Item>(view) {

    init {
        view.setOnClickListener {
            onClick.invoke(adapterPosition)
        }
    }

    override fun setData(data: Item) {
        Glide.with(view.context)
                .load(data.url)
                .apply(RequestOptions().centerCrop())
                .into(view.iv_item)
       // val decimalFormat = DecimalFormat("#,###,##0.00")

    }
}