
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.notesapp.foodappui.composables.RestaurantMenuItem
import com.example.notesapp.foodappui.model.Restaurant

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RestaurantMenu(restaurant: Restaurant) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(restaurant.menu) { item ->
            RestaurantMenuItem(item)
        }
    }
}