package com.curtisploit.bm9k.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CurrencyManager @Inject constructor() {
    private var presses: Int = 0

    fun add(amount: Int) { presses += amount }
    fun spend(amount: Int): Boolean = if (presses >= amount) {
        presses -= amount; true
    } else false
    fun getBalance(): Int = presses
}
