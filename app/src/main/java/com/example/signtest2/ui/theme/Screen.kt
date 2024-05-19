package com.example.signtest2.ui.theme

sealed class Screen (val route : String){


    object Login : Screen(route = "login_screen")
    object SignIn : Screen(route = "signin_scren")
}