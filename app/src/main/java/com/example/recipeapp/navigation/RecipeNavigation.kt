package com.example.recipeapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.recipeapp.screens.details.DetailsScreen
import com.example.recipeapp.screens.home.MainScreen
import com.example.recipeapp.screens.details.FirstScreen

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun RecipeNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = RecipeScreens.MainScreen.name ) {

        composable(RecipeScreens.MainScreen.name){
            //here we pass where this should lead us to
            MainScreen(navController = navController)
        }

        composable(RecipeScreens.FirstScreen.name){
            //here we pass where this should lead us to
            FirstScreen(navController = navController)
        }

        //www.google.com/detail-screen/id=34
        composable(RecipeScreens.DetailsScreen.name+"/{recipe}",
            arguments = listOf(navArgument(name = "recipe") {type = NavType.StringType})) {
                backStackEntry ->

            DetailsScreen(navController = navController,
                backStackEntry.arguments?.getString("recipe"))
        }


    }

}