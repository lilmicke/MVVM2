package com.example.mvvmnavigationapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigationapp.ui.theme.screens.home.HomeScreen

@Composable
fun AppNavHost(
    modifier :Modifier= Modifier,
    navController: NavHostController= rememberNavController(),
    startDestination:String= ROUTE_HOME
){
    NavHost(navController = navController
        ,modifier = Modifier
        ,startDestination = startDestination ) {

        composable(ROUTE_HOME) {
            HomeScreen(naveController=navController)
        }
        composable(ROUTE_ABOUT) {
            HomeScreen(naveController = navController)

        }
        composable(ROUTE_PRODUCTS){
            HomeScreen(naveController=navController)
    }
        composable(ROUTE_SIGNUP){
            HomeScreen(naveController=navController)
    }
        composable(ROUTE_LOGIN){
            HomeScreen(naveController=navController)
}
    }
}