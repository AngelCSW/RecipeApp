package com.example.recipeapp.widgets

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation

import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import com.example.recipeapp.model.Recipe
import com.example.recipeapp.model.getRecipes


@ExperimentalAnimationApi
@Preview
@Composable
fun RecipeRow(recipe: Recipe = getRecipes()[0],
             onItemClick: (String) -> Unit = {} ) {
    var expanded by remember {
        mutableStateOf(false)
    }
    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        //.height(130.dp)
        .clickable {
            onItemClick(recipe.id)

        },
        shape = RoundedCornerShape(corner = CornerSize(16.dp))) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start) {
            Surface(modifier = Modifier
                .padding(12.dp)
                .size(100.dp),
                shape = RectangleShape) {
                Image(painter = rememberImagePainter(data = recipe.poster,
                    builder = {
                        crossfade(true)
                        transformations(CircleCropTransformation())
                    }),
                    contentDescription = "Recipe Images")

            }
            Column(modifier = Modifier.padding(4.dp)) {
                Text(text = recipe.title,
                    style = MaterialTheme.typography.bodyMedium)
                Text(text = "Author: ${recipe.author}",
                    style = MaterialTheme.typography.bodyMedium)
                Text(text = "Published: ${recipe.year}",
                    style = MaterialTheme.typography.bodyMedium)

                AnimatedVisibility(visible = expanded) {
                    Column {
                        Text( buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color.DarkGray,
                                fontSize = 13.sp)) {
                                append("Steps:\n")
                            }
                            withStyle(style = SpanStyle(color = Color.DarkGray,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Light)) {
                                append(recipe.steps)
                            }

                        }, modifier = Modifier.padding(6.dp))

                        Divider(modifier = Modifier.padding(3.dp))
                        Text(text = "Author: ${recipe.author}", style = MaterialTheme.typography.bodyMedium)
                        Text(text = "Ingredients:\n${recipe.ingredients}", style = MaterialTheme.typography.bodyMedium)
                        Text(text = "\nRating: ${recipe.rating}", style = MaterialTheme.typography.bodyMedium)

                    }
                }



                Icon(imageVector = if (expanded) Icons.Filled.KeyboardArrowUp else
                    Icons.Filled.KeyboardArrowDown,
                    contentDescription = "Down Arrow",
                    modifier = Modifier
                        .size(25.dp)
                        .clickable {
                            expanded = !expanded
                        },
                    tint = Color.DarkGray)
            }


        }



    }


}