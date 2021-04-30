package com.jjp.quotes.adapter

import android.view.View
import androidx.annotation.ColorRes
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.adapter_item_quote.view.*

class QuotesViewHolder
constructor(
    override val containerView: View
) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun setName(name: String) {
        itemView.name.text = name
    }

    fun setExchange(exchange: String) {
        itemView.exchange.text = exchange
    }

    fun setValueBackgroundColor(@ColorRes color: Int) {
        // TODO
    }

    fun setValue(value: String) {
        itemView.value.text = value
    }

    fun setValueInfo(info: String) {
        itemView.valueInfo.text = info
    }
}
