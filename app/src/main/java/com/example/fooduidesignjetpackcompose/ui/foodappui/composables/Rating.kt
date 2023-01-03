package com.example.fooduidesignjetpackcompose.ui.foodappui.composables

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import com.example.fooduidesignjetpackcompose.R

@Composable
fun Rating(rating: Int) {
    LazyRow {
        items(rating) {
            Icon(Icons.Default.Star, "rating", tint = colorResource(id = R.color.deepOrange))
        }
    }
}