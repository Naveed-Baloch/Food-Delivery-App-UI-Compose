import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.fooduidesignjetpackcompose.R
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fooduidesignjetpackcompose.ui.foodappui.data.restaurants
import com.example.fooduidesignjetpackcompose.ui.foodappui.composables.Rating
import com.example.notesapp.foodappui.model.Restaurant


@Composable
fun Restaurants(navigator:NavController) {
    Column(horizontalAlignment = Alignment.Start) {
        Text(
            "Restaurants", modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                letterSpacing = 1.2.sp
            ),
        )
        LazyColumn() {
            items(restaurants) { item: Restaurant ->
                RestaurantItem(restaurant = item) {
                    navigator.currentBackStackEntry?.arguments?.putParcelable("restaurant", item)
                    navigator.navigate("restaurant")
                }
            }
        }
    }

}

@Composable
fun RestaurantItem(restaurant: Restaurant, onclick: () -> Unit) {
    Box(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 5.dp)
            .height(120.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
            .border(
                width = 1.dp,
                color = colorResource(id =R.color.deepOrange),
                shape = RoundedCornerShape(15.dp)
            )
            .clickable {
                onclick.invoke()
            }

    ) {
        Row {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .width(120.dp)
                    .height(120.dp)

            ) {
                Image(
                    painter = painterResource(id = restaurant.image),
                    contentDescription = restaurant.name,
                    contentScale = ContentScale.FillBounds
                )
            }
            Box(
                modifier = Modifier.padding(12.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        restaurant.name,
                        style =
                        TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Rating(restaurant.rating)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        restaurant.address,
                        style = TextStyle(
                            fontSize = 12.0.sp, fontWeight = FontWeight.W600
                        ),
                        overflow = TextOverflow.Ellipsis,
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        "0.3 Km away",
                    )
                }
            }
        }
    }

}