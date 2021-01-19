package com.example.calku

import android.view.View

interface Calculator {

    fun onDigit(view: View)
    fun onOperation(view: View)
    fun onClear(view: View)
    fun onEqual(view: View)
    fun onBreaketStart(view: View)
    fun onBreaketEnd(view: View)
    fun onDecimal(view: View)
    fun onDelete(view: View)
}