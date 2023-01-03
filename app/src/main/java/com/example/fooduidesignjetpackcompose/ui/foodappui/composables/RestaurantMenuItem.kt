package com.example.notesapp.foodappui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooduidesignjetpackcompose.R
import com.example.notesapp.foodappui.model.Food

@Composable
fun RestaurantMenuItem(menu: Food) {
    Box(
        modifier = Modifier
            .height(175.dp)
            .width(175.dp)
            .clip(
                RoundedCornerShape(10.dp)
            )
    ) {
        Image(
            contentScale = ContentScale.FillBounds,
            painter = painterResource(id = menu.image),
            contentDescription = menu.name,
            //alpha = 0.7F,
            modifier = Modifier
                .height(175.dp)
                .width(175.dp)
                .clip(
                    RoundedCornerShape(10.dp)
                )
        )
        Box(
            modifier = Modifier
                .height(175.dp)
                .width(175.dp)
                .clip(
                    RoundedCornerShape(10.dp)
                )
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color.Black.copy(alpha = .3f),
                            Color.Black.copy(alpha = .3f),
                            Color.Black.copy(alpha = .3f),
                        ),
                        start = Offset(0f, 0f),
                        end = Offset(175f, 175f)
                    )
                )
        )

        Column(
            modifier = Modifier.matchParentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                menu.name,
                style = TextStyle(
                    fontSize = 24.0.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                ),
            )
            Text(
                "$${menu.price}",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                ),
            )
        }
        Box(modifier = Modifier
            .padding(15.dp)
            .width(48.dp)
            .clip(CircleShape)
            .align(Alignment.BottomEnd)
            .background(
                color = colorResource(
                    id = R.color.deepOrange
                )
            ), content = {
            IconButton(onClick = { }) {
                Icon(Icons.Default.Add, "add")
            }
        })
    }
}


