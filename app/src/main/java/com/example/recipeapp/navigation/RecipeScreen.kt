package com.example.recipeapp.navigation

import java.lang.IllegalArgumentException

//www.google.com/sign_in
enum class RecipeScreens {
    MainScreen,
    FirstScreen,
    DetailsScreen;
    companion object {
        fun fromRoute(route: String?): RecipeScreens
                = when (route?.substringBefore("/")) {
            MainScreen.name -> MainScreen
            FirstScreen.name -> FirstScreen
            DetailsScreen.name -> DetailsScreen
            null -> MainScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}