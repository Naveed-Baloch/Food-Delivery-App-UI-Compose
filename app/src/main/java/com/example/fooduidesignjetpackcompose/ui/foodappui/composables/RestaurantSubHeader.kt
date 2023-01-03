package com.example.notesapp.foodappui.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooduidesignjetpackcompose.R
import com.example.fooduidesignjetpackcompose.ui.foodappui.composables.Rating
import com.example.notesapp.foodappui.model.Restaurant

@Composable
fun SubHeader(restaurant: Restaurant) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    restaurant.name,
                    style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold),
                )
                Rating(restaurant.rating)
                Text(restaurant.address)
            }
            Text(
                text = "0.2 miles away",
                style = TextStyle(fontSize = 18.0.sp),
            )

        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { },
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp)),
                shape = RoundedCornerShape(size = 15.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.deepOrange)
                )
            ) {
                Text(
                    "Reviews",
                    style = TextStyle(fontSize = 20.0.sp, color = Color.White),
                )
            }

            Button(
                onClick = { },
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp)),
                shape = RoundedCornerShape(size = 15.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.deepOrange)
                )
            ) {
                Text(
                    "Contact",
                    style = TextStyle(fontSize = 20.0.sp, color = Color.White),
                )
            }
        } // buttons
        TextButton(
            onClick = { },
        ) {
            Text(
                "Menu",
                style = TextStyle(
                    fontSize = 20.0.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.W600
                ),
            )
        }
    }
}