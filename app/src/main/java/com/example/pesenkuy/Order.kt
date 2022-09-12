package com.example.pesenkuy

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Order(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0,
    var price: Double = 0.0,
    var tag: String = "",
    var calorie: String = ""
) : Parcelable
