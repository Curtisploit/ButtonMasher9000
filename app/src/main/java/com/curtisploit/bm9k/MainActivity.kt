package com.curtisploit.bm9k

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.curtisploit.bm9k.ui.navigation.AppNavHost
import com.curtisploit.bm9k.ui.theme.ButtonMasher9000Theme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ButtonMasher9000Theme {
                AppNavHost() // This handles the navigation now
            }
        }
    }
}
