package com.example.notesapp.foodappui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
class Restaurant(
     val image: Int,
     val name: String,
     val address: String,
     val rating: Int,
     val menu: List<Food>
):Parcelable
