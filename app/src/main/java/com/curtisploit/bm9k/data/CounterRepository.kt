package com.curtisploit.bm9k.data

import kotlinx.coroutines.flow.Flow
import com.curtisploit.bm9k.data.datastore.DataStoreManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CounterRepository @Inject constructor(
    private val dataStore: DataStoreManager
) {
    val counter: Flow<Int> = dataStore.counterFlow

    suspend fun increment() {
        dataStore.incrementCounter()
    }
}
