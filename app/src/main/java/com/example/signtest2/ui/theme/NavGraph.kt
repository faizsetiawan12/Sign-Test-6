package com.example.signtest2.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SetupNavGraph (
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
        ){
        composable(
            route = Screen.Login.route
        ){
            LoginScreen(
                navController = navController
            )
        }
        composable(
            route = Screen.SignIn.route
        ){
            SignInScreen(
                navController = navController
            )
        }
    }
}