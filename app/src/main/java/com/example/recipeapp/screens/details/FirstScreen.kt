package com.example.recipeapp.screens.details

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recipeapp.model.Recipe
import com.example.recipeapp.model.getRecipes
import com.example.recipeapp.navigation.RecipeScreens
import com.example.recipeapp.widgets.RecipeRow


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstScreen(navController: NavController){

    Scaffold(
        topBar = {
            TopAppBar(
                {
                    Row(horizontalArrangement = Arrangement.Start) {
                        Icon(imageVector = Icons.Default.ArrowBack,
                            contentDescription ="Arrow Back",
                            modifier = Modifier.clickable {
                                navController.popBackStack()
                            })
                        Spacer(modifier = Modifier.width(100.dp))

                        Text(text = "Lists of Recipes")

                        Spacer(modifier = Modifier.width(500.dp))

                        Icon(imageVector = Icons.Default.Favorite,
                            contentDescription = "Favourite Recipes",
                            modifier = Modifier.clickable {
                                navController.saveState()
                                //Text(text = "Here are the lists of your favourite recipes")
                            })
                    }
                }
        )  },
        content = { padding ->
            Surface(
                modifier = Modifier.padding(padding),
            ) {
                MainContent(navController = navController)


            }
        }
    )

}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MainContent(navController: NavController,
                recipeList: List<Recipe> = getRecipes()
)  {
    Column(modifier= Modifier.padding(12.dp)){
        LazyColumn{
            items(items = recipeList){

                RecipeRow(recipe = it){ recipe ->
                    navController.navigate(route = RecipeScreens.DetailsScreen.name+"/$recipe")


                }

            }

        }

    }


}
