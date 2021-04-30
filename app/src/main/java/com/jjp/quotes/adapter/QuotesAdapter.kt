package com.jjp.quotes.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jjp.quotes.R

class QuotesAdapter : RecyclerView.Adapter<QuotesViewHolder>() {

    private val items: MutableList<QuoteUiModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuotesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val layout = inflater.inflate(R.layout.adapter_item_quote, parent, false)
        return QuotesViewHolder(layout)
    }

    override fun onBindViewHolder(holder: QuotesViewHolder, position: Int) {
        holder.bind(items[position])
    }

    private fun QuotesViewHolder.bind(item: QuoteUiModel) {
        setName(item.name)
        setExchange(item.exchange)
        setValueBackgroundColor(item.valueBackgroundColor)
        setValue(item.value)
        setValueInfo(item.valueInfo)
    }

    override fun getItemCount(): Int = items.size

    fun setItems(newItems: List<QuoteUiModel>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }
}
