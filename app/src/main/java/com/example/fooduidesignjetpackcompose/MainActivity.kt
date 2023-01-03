package com.example.fooduidesignjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fooduidesignjetpackcompose.ui.foodappui.screens.FoodHomeScreen
import com.example.fooduidesignjetpackcompose.ui.theme.FoodUIDesignJetPackComposeTheme
import com.example.notesapp.foodappui.model.Restaurant
import com.example.notesapp.foodappui.screens.RestaurantScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodUIDesignJetPackComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController, startDestination = "home") {
                        composable(route = "home") {
                            FoodHomeScreen(navController)
                        }
                        composable(route = "restaurant") {
                            val restaurant =
                                navController.previousBackStackEntry?.arguments?.getParcelable<Restaurant>(
                                    "restaurant"
                                )
                            RestaurantScreen(restaurant)

                        }
                    }
                }
            }
        }
    }
}