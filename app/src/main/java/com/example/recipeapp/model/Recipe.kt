package com.example.recipeapp.model

data class Recipe(val id: String,
                 val title: String,
                 val year: String,
                 val genre: String,
                 val author: String,
                 val ingredients: String,
                 val steps: String,
                  val poster: String,
                 val images: List<String>,
                 val rating: String)

fun getRecipes(): List<Recipe> {
    return listOf(
        Recipe(id = "rr0499549",
            title = "Portuguese Egg Tart",
            year = "2022",
            genre = "Breakfast, Dessert",
            author = "Vivien",
            ingredients = "cooking spray\n" +
                    "\n" +
                    "1 (11 ounce) package pie crust mix (such as Betty Crocker®)\n" +
                    "\n" +
                    "3 tablespoons cold butter, cubed\n" +
                    "\n" +
                    "⅓ cup ice cold water\n" +
                    "\n" +
                    "4 egg yolks\n" +
                    "\n" +
                    "⅓ cup white sugar, or to taste\n" +
                    "\n" +
                    "⅓ cup heavy cream\n" +
                    "\n" +
                    "⅓ cup milk\n" +
                    "\n" +
                    "3 drops vanilla extract",
            steps = "1. Preheat oven to 400 degrees F (200 degrees C). Spray 12 muffin cups with cooking spray.\n" +
                    "\n" +
                    "2. Place the pie crust mix into a bowl, and lightly rub the butter and water into the mix until the mixture holds together well enough to form a ball. Turn the dough out onto a floured surface, and knead several times to make the dough more elastic. Form into a ball again, and cut the ball in half; cut each half into half again (4 pieces); cut each quarter into thirds to make 12 total pieces. Roll the pieces into balls, and set aside.\n" +
                    "\n" +
                    "3. Beat together the egg yolks, sugar, cream, milk, and vanilla extract in a bowl until light and foamy, about 3 minutes; strain the filling through a fine mesh strainer into a clean bowl.\n" +
                    "\n" +
                    "4. Press a dough ball into the bottom and about 1 1/2 inches up the sides of a prepared muffin cup; repeat for remaining dough pieces. Spoon each crust about 80 percent full of the egg yolk mixture.\n" +
                    "\n" +
                    "5. Bake in the preheated oven until the crusts are golden brown, the filling is set, and the tarts are lightly browned, 15 to 20 minutes.",
            poster = "https://img.jakpost.net/c/2018/09/10/2018_09_10_53408_1536576820._large.jpg",
            images = listOf("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F9441937.jpg&q=60&c=sc&poi=auto&orient=true&h=512",
                "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F2569216.jpg&q=60&c=sc&poi=auto&orient=true&h=512",
                "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F1108347.jpg&q=60&c=sc&poi=auto&orient=true&h=512"

            ),
            rating = "4.5/5.0"),

        Recipe(id = "rr0416449",
            title = "Homemade Spaghetti",
            year = "2024",
            genre = "Breakfast, Lunch, Dinner",
            author = "The Daily Gourmet",
            ingredients = "16 ounces ring-shaped pasta  (Anelli Siciliani)\n" +
                    "\n" +
                    "30 ounces tomato sauce\n" +
                    "\n" +
                    "1 tablespoon Cantanzaro herbs, (such as Savory Spice Shop® Cantanzaro herbs)\n" +
                    "\n" +
                    "2 teaspoons white sugar\n" +
                    "\n" +
                    "1 teaspoon salt, or to taste\n" +
                    "\n" +
                    "1/2 teaspoon freshly ground black pepper\n" +
                    "\n" +
                    "16 ounces Italian-style meatballs\n" +
                    "\n" +
                    "1/2 cup freshly shaved Parmesan cheese, or as needed, for garnish\n" +
                    "\n" +
                    "fresh basil, for garnish",
            steps = "1. Fill a large pot with lightly salted water and bring to a rolling boil. Stir in pasta and return to a boil. Cook, uncovered, stirring occasionally, until tender yet firm to the bite, about 8 minutes. Reserve 1/2 cup pasta water, drain pasta, and set aside.\n" +
                    "\n" +
                    "2. Add tomato sauce, Cantanzaro herbs, sugar, salt. and pepper to the pot; bring to a simmer over medium-low heat.\n" +
                    "\n" +
                    "3. Meanwhile, cut each meatball into 4 pieces. Roll each piece into a mini meatball. Drop meatballs into sauce; simmer until heated through, about 10 minutes. If sauce seems too thick, thin out by adding pasta water, 1 tablespoon at a time. \n" +
                    "\n" +
                    "4. Stir in cooked pasta rings. Garnish with basil leaves and Parmesan shavings and serve immediately.",
            poster = "https://static01.nyt.com/images/2017/04/05/dining/05COOKING-NIGMEATBALLS2/05COOKING-NIGMEATBALLS2-superJumbo.jpg",
            images = listOf("https://feelgoodfoodie.net/wp-content/uploads/2020/06/how-to-cook-pasta-6-500x375.jpg",
                "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2022/08/12/adding-spaghetti-to-pan-of-marinara-sauce.jpg.rend.hgtvcom.1280.960.suffix/1660388332646.jpeg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3AQLNWgsPl2s7kMFiwIZLdhj0t0xU5cWGUVTiUIkSwS2n-lML_WyCdJOIj3wKuANyLyU&usqp=CAU"

            ),
            rating = "4.5/5.0"),

        Recipe(id = "rr0848228",
            title = "Island Style Fried Rice",
            year = "2023",
            genre = "Breakfast, Lunch, Dinner",
            author = "Chen",
            ingredients = "3 cups water\n" +
                    "\n" +
                    "1 ½ cups uncooked jasmine rice\n" +
                    "\n" +
                    "2 teaspoons canola oil\n" +
                    "\n" +
                    "1 (12 ounce) can fully cooked luncheon meat (such as SPAM), cubed\n" +
                    "\n" +
                    "½ cup sliced Chinese sweet pork sausage (lup cheong)\n" +
                    "\n" +
                    "3 large eggs, beaten\n" +
                    "\n" +
                    "2 tablespoons canola oil\n" +
                    "\n" +
                    "½ teaspoon garlic powder\n" +
                    "\n" +
                    "1 (8 ounce) can pineapple chunks, drained\n" +
                    "\n" +
                    "3 tablespoons oyster sauce\n" +
                    "\n" +
                    "½ cup chopped green onion",
            steps = "1. Bring water and rice to a boil in a saucepan over high heat. Reduce heat to medium-low, cover, and simmer until rice is tender and liquid has been absorbed, 20 to 25 minutes. Let rice cool completely.\n" +
                    "\n" +
                    "2. Heat 2 teaspoons oil in a large nonstick skillet over medium heat. Cook and stir luncheon meat and sausage in hot oil until browned. Remove meat mixture to a plate. Pour beaten eggs into the same skillet; cook and stir until eggs are scrambled. Transfer eggs to the plate with meat mixture.\n" +
                    "\n" +
                    "3. Heat 2 tablespoons oil in the same skillet over medium heat. Cook and stir cooled rice in hot oil until heated through and beginning to brown, about 2 minutes. Add garlic powder; toss rice to develop garlic taste, about 1 minute. Stir in cooked meats, scrambled eggs, pineapple, and oyster sauce. Cook and stir until well combined and heated through, 2 to 3 minutes. Stir in green onion to serve.",
            poster = "https://life-in-the-lofthouse.com/wp-content/uploads/2022/06/Hawaiian-Fried-Rice225.jpg",
            images = listOf("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F9337368.jpg&q=60&c=sc&poi=auto&orient=true&h=512",
                "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F9354633.jpg&q=60&c=sc&poi=auto&orient=true&h=512",),
            rating = "4.7/5.0"),

        )
}