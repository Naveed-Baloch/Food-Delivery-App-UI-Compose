package com.example.fooduidesignjetpackcompose.ui.foodappui.screens

import Restaurants
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.fooduidesignjetpackcompose.R
import com.example.notesapp.foodappui.composables.RecentOrders
import com.example.notesapp.foodappui.composables.SearchBarHome
@Composable
fun FoodHomeScreen(navController: NavController) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text("Food Delivery", color = Color.White)
                },
                navigationIcon = {
                    Icon(Icons.Default.AccountCircle, "Account", tint = Color.White)
                },
                actions = {
                    Icon(Icons.Default.ShoppingCart, "Account", tint = Color.White)
                },
                backgroundColor = colorResource(id = R.color.deepOrange)
            )
        },
        content = {
            Column(
                content = {
                    Spacer(modifier = Modifier.height(10.dp))
                    SearchBarHome()
                    RecentOrders()
                    Restaurants(navController)
                }
            )
        }
    )
}
