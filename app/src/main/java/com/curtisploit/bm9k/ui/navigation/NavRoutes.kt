package com.curtisploit.bm9k.ui.navigation

sealed class NavRoutes(val route: String) {
    object Button : NavRoutes("button")

    // Add more screens like this as your app grows
    // object Shop : NavRoutes("shop")
}
