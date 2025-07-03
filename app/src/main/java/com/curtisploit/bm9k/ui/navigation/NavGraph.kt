package com.curtisploit.bm9k.ui.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.curtisploit.bm9k.ui.screen.ButtonScreen
import com.curtisploit.bm9k.viewmodel.CounterViewModel

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: String = NavRoutes.Button.route
) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(NavRoutes.Button.route) {
            val viewModel: CounterViewModel = hiltViewModel()
            ButtonScreen(viewModel = viewModel)
        }
    }
}
