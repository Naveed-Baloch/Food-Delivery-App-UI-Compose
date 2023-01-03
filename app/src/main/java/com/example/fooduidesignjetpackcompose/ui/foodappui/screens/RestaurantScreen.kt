package com.example.notesapp.foodappui.screens

import RestaurantHeader
import RestaurantMenu
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.fooduidesignjetpackcompose.ui.foodappui.data.restaurant0
import com.example.notesapp.foodappui.composables.SubHeader
import com.example.notesapp.foodappui.model.Restaurant

@Composable
fun RestaurantScreen(restaurant: Restaurant?) {
    val tempRestaurant = restaurant ?: restaurant0
    Column(modifier = Modifier.fillMaxSize()) {
        RestaurantHeader(restaurant = tempRestaurant)
        SubHeader(restaurant = tempRestaurant)
        RestaurantMenu(restaurant = tempRestaurant)
    }
}

