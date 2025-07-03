package com.curtisploit.bm9k.ui.button

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.curtisploit.bm9k.viewmodel.CounterViewModel

@Composable
fun MyCounterButton(
    count: Int,
    onIncrement: () -> Unit,
    modifier: Modifier = Modifier // Added modifier for flexibility
) {
    Box(
        modifier = modifier.fillMaxSize(), // Use the passed modifier
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = onIncrement) {
            Text("Count: $count")
        }
    }
}

// Usage in a screen-level Composable (or wherever the ViewModel is scoped):
@Composable
fun CounterScreen(viewModel: CounterViewModel = hiltViewModel()) {
    val count by viewModel.counter.collectAsState()
    MyCounterButton(
        count = count,
        onIncrement = { viewModel.increment() }
    )
}
