package com.example.fooduidesignjetpackcompose.ui.foodappui.data

import com.example.fooduidesignjetpackcompose.R
import com.example.notesapp.foodappui.model.Food
import com.example.notesapp.foodappui.model.Order
import com.example.notesapp.foodappui.model.Restaurant
import com.example.notesapp.foodappui.model.User

// Food
val burrito =
    Food(image = R.drawable.burrito, name = "Burrito", price = 8.99);
val steak =
    Food(image = R.drawable.steak, name = "Steak", price = 17.99);
val pasta =
    Food(image = R.drawable.pasta, name = "Pasta", price = 14.99);
val ramen =
    Food(image = R.drawable.ramen, name = "Ramen", price = 13.99);
val pancakes =
    Food(image = R.drawable.pancakes, name = "Pancakes", price = 9.99);
val burger =
    Food(image = R.drawable.burger, name = "Burger", price = 14.99);
val pizza =
    Food(image = R.drawable.pizza, name = "Pizza", price = 11.99);
val salmon = Food(
    image = R.drawable.salmon, name = "Salmon Salad", price = 12.99
);

// Restaurants
val restaurant0 = Restaurant(
    image = R.drawable.restaurant0,
    name = "Emerald Grill",
    address = "200 Main St, New York, NY",
    rating = 5,
    menu = listOf(burrito, steak, pasta, ramen, pancakes, burger, pizza, salmon),
);
val restaurant1 = Restaurant(
    R.drawable.restaurant1,
    name = "Chef’s Choice",
    address = "200 Main St, New York, NY",
    rating = 4,
    menu = listOf(steak, pasta, ramen, pancakes, burger, pizza),
);
val restaurant2 = Restaurant(
    R.drawable.restaurant2,
    name = "Blue Plates",
    address = "200 Main St, New York, NY",
    rating = 4,
    menu = listOf(steak, pasta, pancakes, burger, pizza, salmon),
);
val restaurant3 = Restaurant(
    R.drawable.restaurant3,
    name = "Epic Dining",
    address = "200 Main St, New York, NY",
    rating = 2,
    menu = listOf(burrito, steak, burger, pizza, salmon),
);
val restaurant4 = Restaurant(
    R.drawable.restaurant4,
    name = "Downtown",
    address = "200 Main St, New York, NY",
    rating = 3,
    menu = listOf(burrito, ramen, pancakes, salmon),
);

val restaurants: List<Restaurant> = listOf(
    restaurant0,
    restaurant1,
    restaurant2,
    restaurant3,
    restaurant4,
);

// User
val currentUser = User(
    name = "Rebecca",
    orders = listOf(
        Order(
            date = "Nov 10, 2019",
            food = steak,
            restaurant = restaurant2,
            quantity = 1,
        ),
        Order(
            date = "Nov 8, 2019",
            food = ramen,
            restaurant = restaurant0,
            quantity = 3,
        ),
        Order(
            date = "Nov 5, 2019",
            food = burrito,
            restaurant = restaurant1,
            quantity = 2,
        ),
        Order(
            date = "Nov 2, 2019",
            food = salmon,
            restaurant = restaurant3,
            quantity = 1,
        ),
        Order(
            date = "Nov 1, 2019",
            food = pancakes,
            restaurant = restaurant4,
            quantity = 1,
        ),
    ),
    cart = listOf(
        Order(
            date = "Nov 11, 2019",
            food = burger,
            restaurant = restaurant2,
            quantity = 2,
        ),
        Order(
            date = "Nov 11, 2019",
            food = pasta,
            restaurant = restaurant2,
            quantity = 1,
        ),
        Order(
            date = "Nov 11, 2019",
            food = salmon,
            restaurant = restaurant3,
            quantity = 1,
        ),
        Order(
            date = "Nov 11, 2019",
            food = pancakes,
            restaurant = restaurant4,
            quantity = 3,
        ),
        Order(
            date = "Nov 11, 2019",
            food = burrito,
            restaurant = restaurant1,
            quantity = 2,
        ),
    ),
);