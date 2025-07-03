package com.curtisploit.bm9k.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.*
import com.curtisploit.bm9k.viewmodel.CounterViewModel

@Composable
fun ButtonScreen(viewModel: CounterViewModel) {
    val count by viewModel.counter.collectAsState()

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Presses: $count", style = MaterialTheme.typography.headlineLarge)
            Spacer(Modifier.height(36.dp))
            Button(onClick = { viewModel.increment() }) {
                Text("Mash Me")
            }
        }
    }
}