package com.example.test

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.practicenavigation3screens.LoginScreen
import com.example.test.DetailScreen
import com.example.test.HomeScreen
import com.example.test.Screens

@Composable
fun NavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = Screens.Login.route){
        composable(route = Screens.Login.route){ LoginScreen(navController)}
        composable(route = Screens.Home.route){ HomeScreen(navController)}
        composable(route = Screens.Detail.route){ DetailScreen()}
    }
}