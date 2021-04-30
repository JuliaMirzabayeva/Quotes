package com.jjp.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jjp.quotes.adapter.QuoteUiModel
import com.jjp.quotes.adapter.QuotesAdapter
import kotlinx.android.synthetic.main.activity_quotes.*

class QuotesActivity : AppCompatActivity() {

    private val quotesAdapter: QuotesAdapter = QuotesAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)

        quotesRecycler.adapter = quotesAdapter

        setQuotes(QUOTES_STUB)
    }

    private fun setQuotes(quotes: List<QuoteUiModel>) {
        quotesAdapter.setItems(quotes)
    }

    companion object {
        private val QUOTES_STUB = listOf(
            QuoteUiModel(
                id = 678,
                name = "Name",
                exchange = "Exchange",
                valueBackgroundColor = R.color.green,
                value = "+4,42%",
                valueInfo = "799.98"
            ),
            QuoteUiModel(
                id = 678,
                name = "Name2",
                exchange = "Exchange2",
                valueBackgroundColor = R.color.green,
                value = "+4,422%",
                valueInfo = "799.982"
            )
        )
    }
}