package com.example.notesapp.foodappui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooduidesignjetpackcompose.R
import com.example.fooduidesignjetpackcompose.ui.foodappui.data.currentUser
import com.example.notesapp.foodappui.model.Order

@Composable
fun RecentOrders() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(horizontal = 10.dp)
    ) {
        Text(
            "Recent Orders",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.2.sp
            )
        )
        Box(modifier = Modifier.height(100.dp)) {
            LazyRow {
                items(currentUser.orders) { item: Order ->
                    RecentOrderItem(order = item)
                }
            }
        }

    }
}


@Composable
fun RecentOrderItem(order: Order) {
    Box(
        modifier = Modifier
            .width(320.dp)
            .padding(horizontal = 5.dp, vertical = 5.dp)
            .border(
                width = 1.dp,
                color = colorResource(id = R.color.deepOrange),
                shape = RoundedCornerShape(15.dp)
            )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(modifier = Modifier.clip(RoundedCornerShape(15.dp))) {
                Image(
                    painter = painterResource(id = order.food.image),
                    contentDescription = order.food.name,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
                )
            }
            Box(
                content = {
                    Column(
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            order.food.name,
                            style = TextStyle(
                                fontSize = 18.0.sp,
                                fontWeight = FontWeight.Bold,
                            ),
                            overflow = TextOverflow.Ellipsis
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            order.restaurant.name,
                            style = TextStyle(
                                fontSize = 16.0.sp,
                                fontWeight = FontWeight.W600,
                            ),
                            overflow = TextOverflow.Ellipsis,
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            order.date,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.W600,
                            ),
                            overflow = TextOverflow.Ellipsis,
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                    }
                }

            )
            Box(modifier = Modifier
                .padding(end = 20.dp)
                .width(48.dp)
                .clip(CircleShape)
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
}
