package com.example.recipeapp.screens.details

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.recipeapp.model.Recipe
import com.example.recipeapp.model.getRecipes
import com.example.recipeapp.widgets.RecipeRow


@ExperimentalAnimationApi
@Composable
fun DetailsScreen(navController: NavController,
                  recipeId: String?) {
    val newRecipeList = getRecipes().filter { recipe ->
        recipe.id == recipeId
    }

    Scaffold(
        topBar = { AddAppBar(navController) },
        content = { padding ->
            Surface(
                modifier = Modifier.padding(padding),
            ) {
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = "Lorem ipsum dolor sit amet...")

                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top) {

                    RecipeRow(recipe = newRecipeList.first())
                    Spacer(modifier = Modifier.height(8.dp))
                    Divider()
                    Text(text = "Recipe Poster")
                    HorizontalScrollableImageView(newRecipeList)
                }


            }
        }
    )



}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddAppBar(navController: NavController) {
    TopAppBar(


        {
            Row(horizontalArrangement = Arrangement.Start) {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription ="Arrow Back",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    })
                Spacer(modifier = Modifier.width(100.dp))

                Text(text = "Recipes Details")

                Spacer(modifier = Modifier.width(500.dp))

                Icon(imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Add To Favourite",
                    modifier = Modifier.clickable {
                        navController.saveState()
                        //Text(text = "Recipe saved to favourite.")
                    })

            }

        }


    )

}

@Composable
private fun HorizontalScrollableImageView(newRecipeList: List<Recipe>) {
    LazyRow {
        items(newRecipeList[0].images) { image ->
            Card(modifier = Modifier
                .padding(12.dp)
                .size(240.dp)) {
                Image(painter = rememberImagePainter(data = image),
                    contentDescription = "Recipe Images")

            }
        }
    }
}