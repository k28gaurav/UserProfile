package com.gallery.app.base

interface AdapterItemClick<T> {

    fun onItemClick(viewType: Int, data:T)
}