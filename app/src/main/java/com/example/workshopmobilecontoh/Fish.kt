package com.example.workshopmobilecontoh

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Fish(
    var name : String = "",
    var family : String = "",
    var order : String = "",
    var detail : String = "",
    var photo : Int = 0
) : Parcelable