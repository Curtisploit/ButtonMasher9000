package com.curtisploit.bm9k.data

class InventoryRepository {
    private val items = mutableListOf<String>()

    fun addItem(item: String) {
        items.add(item)
    }

    fun getItems(): List<String> = items
}