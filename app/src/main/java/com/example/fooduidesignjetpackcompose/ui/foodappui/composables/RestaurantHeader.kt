import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.fooduidesignjetpackcompose.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.notesapp.foodappui.model.Restaurant

@Composable
fun RestaurantHeader(restaurant: Restaurant) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = restaurant.image),
            restaurant.name,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 30.dp, horizontal = 20.dp)
        ) {
            IconButton(onClick = {}) {
                Icon(
                    Icons.Default.ArrowBack,
                    "back",
                    Modifier.size(30.dp),
                    tint = Color.White
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    Icons.Default.Favorite,
                    "back",
                    Modifier.size(30.dp),
                    tint = colorResource(id = R.color.deepOrange)
                )
            }
        }
    }
}