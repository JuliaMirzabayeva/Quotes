package com.jjp.quotes.adapter

import androidx.annotation.ColorRes

data class QuoteUiModel (
    val id: Long,
    val name: String,
    val exchange: String,
    @ColorRes val valueBackgroundColor: Int,
    val value: String,
    val valueInfo: String
)
