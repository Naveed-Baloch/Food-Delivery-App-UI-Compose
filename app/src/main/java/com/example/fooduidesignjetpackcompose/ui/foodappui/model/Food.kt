package com.example.notesapp.foodappui.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Food(
    val image: Int,
     val name: String,
     val price: Double
):Parcelable

