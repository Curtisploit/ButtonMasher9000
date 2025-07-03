package com.curtisploit.bm9k.data.datastore

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton


private val Context.dataStore by preferencesDataStore("bm9k_prefs")
private val COUNTER_KEY = intPreferencesKey("counter")

@Singleton
class DataStoreManager @Inject constructor(
    @ApplicationContext private val context: Context
) {
    val counterFlow: Flow<Int> = context.dataStore.data
        .map { prefs -> prefs[COUNTER_KEY] ?: 0 }

    suspend fun incrementCounter() {
        context.dataStore.edit { prefs ->
            val current = prefs[COUNTER_KEY] ?: 0
            prefs[COUNTER_KEY] = current + 1
        }
    }

    suspend fun setCount(value: Int) {
        context.dataStore.edit { prefs ->
            prefs[COUNTER_KEY] = value
        }
    }
}
