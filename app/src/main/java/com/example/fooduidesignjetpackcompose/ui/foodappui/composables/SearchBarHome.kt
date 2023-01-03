package com.example.notesapp.foodappui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.fooduidesignjetpackcompose.R

@Composable
fun SearchBarHome() {
    TextField(value = "", onValueChange = {}, placeholder = {
        Text(text = "Search Food or Restaurants")
    },
        leadingIcon = {
            Icon(
                Icons.Default.Search,
                "search",
                tint = Color.Gray,
                modifier = Modifier.size(30.dp)
            )
        },

        trailingIcon = {
            Icon(
                Icons.Default.Close,
                "cancel",
                tint = Color.Gray,
                modifier = Modifier.size(30.dp),
            )
        },
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White,
            focusedIndicatorColor = Color.White, unfocusedIndicatorColor = Color.White
        ),
        shape = RoundedCornerShape(size = 20.dp),
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
            .border(width = 1.dp, color = colorResource(id = R.color.deepOrange), shape = RoundedCornerShape(20.dp))
    )
}